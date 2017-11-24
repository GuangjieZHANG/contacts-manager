package com.fredericboisguerin.insa;

import com.opencsv.CSVWriter;
import groovy.json.internal.IO;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvWriter {

    private static final ContactsManager c=new ContactsManager();
    private static final String SOME_VALID_EMAIL = "toto@titi.fr";
    private static final String SOME_VALID_PHONE_NUMBER = "0123456789";
    private static final String SOME_VALID_NAME = "Toto titi";

    public static void main(String[] args) throws Exception{

        c.addContact(SOME_VALID_NAME, SOME_VALID_EMAIL, SOME_VALID_PHONE_NUMBER);

        File file = new File("/home/gzhang/POO/test.csv");
        Writer writer = new FileWriter(file);
        CSVWriter csvWriter = new CSVWriter(writer,',');
        String[] str = new String[c.getContactsManager().size()];
        for(int i=0;i<c.getContactsManager().size();i++){
            str[i]=c.getContactsManager().get(i).toString();
        }
       /* String[] str1 = new String[2];
        str1[0]="this is a ";
        str1[1]="test hahaha";*/
        for(int i=0;i<c.getContactsManager().size();i++){
       System.out.println(c.getContactsManager().get(i).toString());}
        csvWriter.writeNext(str);
        csvWriter.close();

    }

}
