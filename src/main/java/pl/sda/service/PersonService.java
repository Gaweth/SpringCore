package pl.sda.service;

import pl.sda.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getById(String id);
}
