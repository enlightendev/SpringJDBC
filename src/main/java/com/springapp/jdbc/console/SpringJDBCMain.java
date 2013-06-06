package com.springapp.jdbc.console;

import com.springapp.jdbc.dao.ContactDao;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: jl25292
 * Date: 6/6/13
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpringJDBCMain {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);

        // Find first name by id
        System.out.println("First name for contact id 1 is: " + contactDao.findFirstNameById(1l));

    }
}
