package pl.sda.dao.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoMemory implements PersonDao {

    private List<Person> persons = new ArrayList<>();

    public PersonDaoMemory(){
        persons.add(new Person(1,"Jan","Nowak"));
        persons.add(new Person(2,"Tomek","Kowal"));
        persons.add(new Person(3,"Piotr","Michna"));
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public Person getById(int id) {
        return persons.stream()
                .filter(p ->p.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
