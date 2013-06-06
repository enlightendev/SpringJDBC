package com.springapp.jdbc.dao;

import com.springapp.jdbc.domain.Contact;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jl25292
 * Date: 6/6/13
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContactDao {

    public List<Contact> findAll();

    public List<Contact> findByFirstName(String firstName);

    public String findFirstNameById(Long id);

    public void insert(Contact contact);

    public void update(Contact contact);

    public void delete(Long contactId);
}