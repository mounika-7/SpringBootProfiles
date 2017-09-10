package com.yourname.service;

import com.yourname.dao.StudentDao;
import com.yourname.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mysql")
    private StudentDao clientDao;

    public Collection<Student> getAllClients(){

        return this.clientDao.getAllClients();
    }

    public Student getClientById(int id){
        return this.clientDao.getClientById(id);
    }


    public void removeClientById(int id) {
        this.clientDao.removeClientById(id);
    }

    public void updateClient(Student client){
        this.clientDao.updateClient(client);
    }

    public void insertClient(Student client) {
        this.clientDao.insertClient(client);
    }
}
