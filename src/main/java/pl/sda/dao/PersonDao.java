package pl.sda.dao;

import pl.sda.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> getAll();

    Person getById(int id);
}
