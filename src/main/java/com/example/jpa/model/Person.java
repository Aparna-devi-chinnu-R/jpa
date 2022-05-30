package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Person.findAll" , query = "select p from Person p")
public class Person {

    @Id
    private int id;
    private String name;
    private String location;

    public Person(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Person() {
        
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
