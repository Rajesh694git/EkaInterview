package com.example.demo;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
//Fourth question continued
@Table(name="places")
public class Place {

    @Id
    private String id;

    private String name;

    public Place() {
    }

    public Place(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getid(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @ManyToMany(mappedBy = "contacts", fetch = FetchType.LAZY)
    private Set<Contact> contacts = new HashSet<>();

}
