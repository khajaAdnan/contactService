package com.contact.Controller;

import com.contact.Entity.Contact;
import com.contact.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/{userId}")
    public List<Contact> getContact(@PathVariable Long userId){
        return contactService.getContact(userId);
    }

    @GetMapping(value = "/test")
    public List<Contact> getContact(){
        return contactService.getAll();
    }
}
