package br.com.giomafra.controllers;

import br.com.giomafra.PersonServices;
import br.com.giomafra.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    //injetar a instancia de service quando for necessário
    @Autowired
    private PersonServices service;

    @RequestMapping(method = RequestMethod.GET,produces =  MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces =  MediaType.APPLICATION_JSON_VALUE)
    public Person fyndById(@PathVariable("id")String id){
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST,consumes =  MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person){
        return service.create(  person);
    }




}
