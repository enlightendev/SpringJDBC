package com.springapp.jdbc.console;

import com.springapp.jdbc.dao.ContactDao;
import com.springapp.jdbc.dao.plain.PlainContactDao;
import com.springapp.jdbc.domain.Contact;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jl25292
 * Date: 6/6/13
 * Time: 1:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlainJDBCMain {

    private static ContactDao contactDao = new PlainContactDao();

    public static void main(String[] args) {

        // List all contacts
        System.out.println("Listing initial contact data:");
        listAllContacts();

        System.out.println();

        // Insert a new contact
        System.out.println("Insert a new contact");
        Contact contact = new Contact();
        contact.setFirstName("Jacky");
        contact.setLastName("Chan");
        contact.setBirthDate(new Date((new GregorianCalendar(2001, 10,1)).getTime().getTime()));
        contactDao.insert(contact);
        System.out.println("Listing contact data after new contact created:");
        listAllContacts();

        System.out.println();

        // Delete the above newly created contact
        System.out.println("Deleting the previous created contact");
        contactDao.delete(contact.getId());
        System.out.println("Listing contact data after new contact deleted:");
        listAllContacts();

    }

    private static void listAllContacts() {

        List<Contact> contacts = contactDao.findAll();

        for (Contact contact: contacts) {
            System.out.println(contact);
        }
    }
}