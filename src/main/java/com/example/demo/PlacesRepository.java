package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

    public interface PlacesRepository extends CrudRepository<Place, Long> {

        //REST method to list contact by place name
       List<Contact> findContactByName(String name);

    }
