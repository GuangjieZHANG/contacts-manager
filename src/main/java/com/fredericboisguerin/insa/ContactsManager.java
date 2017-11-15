package com.fredericboisguerin.insa;

import java.util.ArrayList;


public class ContactsManager {

    private ArrayList<Contact> contactsManager = new ArrayList<>();

    public void addContact(String name, String email, String phoneNumber) {


            Contact contact = new Contact(name,email,phoneNumber);
            contactsManager.add(contact);

    }

    public void printAllContacts() {

        for(int i=0;i<contactsManager.size();i++){
            contactsManager.get(i).printcontact();
        }

    }

    public void searchContactByName(String name) {

        for(int i=0;i<contactsManager.size();i++){
            if(contactsManager.get(i).getName().toLowerCase().contains(name))

            contactsManager.get(i).printcontact();
        }

    }
}
