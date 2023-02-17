package com.contact.Service;

import com.contact.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    List<Contact> contactList = List.of(
            new Contact(1L, "Khaja@gmail.com" , "Khaja" , 1121L),
            new Contact(2L, "Chaitanya@gmail.com" , "Chaitanya" , 1121L),
            new Contact(3L, "Ridhi@gmail.com" , "Ridhi" , 1123L),
            new Contact(4L, "Tripathi@gmail.com" , "Tripathi" , 1124L)
    );

    public List<Contact> getContact(Long userId) {
        return contactList.stream().filter(f->f.getUserId().equals(userId)).collect(Collectors.toList());
    }

    public List<Contact> getAll() {
        return contactList;
    }
}
