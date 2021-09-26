package com.example.parse;

import com.example.parse.Person;

public interface PersonService {

    public Person saveUpdatePerson(Person person);

    public Person findPersonById(Integer id);
}
