package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContactsManager {

    private ArrayList<Contact> contactsManager = new ArrayList<>();

    public void addContact(String name, String email, String phoneNumber)throws InvalidContactNameException,InvalidEmailException{

        if(name==null||name.equals("")){
            throw new InvalidContactNameException();
        }


        if(!checkEmaile(email)){
            throw new InvalidEmailException();
        }


            Contact contact = new Contact(name,email,phoneNumber);
            contactsManager.add(contact);



        }




    private static boolean checkEmaile(String emaile){
        String RULE_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";

        Pattern p = Pattern.compile(RULE_EMAIL);

        Matcher m = p.matcher(emaile);

        return m.matches();
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
