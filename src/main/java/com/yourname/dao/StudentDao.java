package com.yourname.dao;

import com.yourname.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllClients();

    Student getClientById(int id);

    void removeClientById(int id);

    void updateClient(Student client);

    void insertClient(Student client);
}
