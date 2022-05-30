package com.example.jpa.repository;

import com.example.jpa.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository // saying that it is a repository
@Transactional // either pass all transaction or fail all transaction in class level
public class PersonRepository{


    //connect to database
    @PersistenceContext
    EntityManager entityManager; // manages entities. all the operations that are performed on the entity are stored
                                            // in entity manager, not actually in entity manager but in persistence context. interface btw persistence context and entity

    public Person findById(int id){
        return entityManager.find(Person.class,id);
    }

    public void deleteById(int id){
        entityManager.remove(entityManager.find(Person.class,id));
    }

    public Person update(Person person){
        return entityManager.merge(person); // check if the id is already present if present update else create entry
    }

    public Person insert(Person person){
        return entityManager.merge(person);  // there is no diff btw inset and update here
    }

    public List<Person> findAll(){
        Query namedQuery = entityManager.createNamedQuery("Person.findAll");
        return namedQuery.getResultList();
    }

}
