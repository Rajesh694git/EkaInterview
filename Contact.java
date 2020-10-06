package com.example.demo;

import javax.persistence.*;

@Entity
@IdClass(PersonalIdentification.class)
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Id
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public Contact() {

    }

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(String email){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}