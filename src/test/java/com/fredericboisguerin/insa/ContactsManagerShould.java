package com.fredericboisguerin.insa;

import org.junit.Test;

public class ContactsManagerShould {

    private static final String SOME_VALID_EMAIL = "toto@titi.fr";
    private static final String SOME_VALID_PHONE_NUMBER = "0123456789";
    private static final String SOME_VALID_NAME = "Toto titi";

    @Test(expected = InvalidContactNameException.class)
    public void fail_if_no_name() throws InvalidContactNameException,InvalidEmailException{
        ContactsManager contactsManager = new ContactsManager();
        String noName = null;
        contactsManager.addContact(noName, SOME_VALID_EMAIL, SOME_VALID_PHONE_NUMBER);
    }

    @Test(expected = InvalidContactNameException.class)
    public void fail_if_name_is_empty() throws InvalidContactNameException,InvalidEmailException{
        ContactsManager contactsManager = new ContactsManager();
        String emptyName = "";

        contactsManager.addContact(emptyName, SOME_VALID_EMAIL, SOME_VALID_PHONE_NUMBER);
    }

    @Test(expected = InvalidEmailException.class)
    public void fail_if_email_is_not_valid() throws InvalidContactNameException,InvalidEmailException{
        ContactsManager contactsManager = new ContactsManager();
        String invalidEmail = "tototitifr";

        contactsManager.addContact(SOME_VALID_NAME, invalidEmail, SOME_VALID_PHONE_NUMBER);
    }
}
