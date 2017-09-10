package com.yourname.controller;

import com.yourname.entity.Student;
import com.yourname.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private StudentService clientService;

    @RequestMapping(value="/client",method = RequestMethod.GET)
    public  Collection<Student> getAllClients(){
        return clientService.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getClientById(@PathVariable("id") int id){
        return clientService.getClientById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteClientById(@PathVariable("id") int id){
        clientService.removeClientById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateClientById(@RequestBody Student client){
        clientService.updateClient(client);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertClient(@RequestBody Student client){
        clientService.insertClient(client);
    }
}
