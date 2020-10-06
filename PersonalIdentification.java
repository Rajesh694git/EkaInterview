package com.example.demo;

public class PersonalIdentification {

    private Integer id;
    private String email;

    public PersonalIdentification() {
    }

    public PersonalIdentification(Integer id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalIdentification personaldetails = (PersonalIdentification) o;
        return id==personaldetails.id &&
                email.equals(personaldetails.email);
    }
}
