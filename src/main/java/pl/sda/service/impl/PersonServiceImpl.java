package pl.sda.service.impl;

import pl.sda.dao.PersonDao;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.util.PersonUtil;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    private  PersonUtil personUtil;

    public PersonServiceImpl(PersonDao personDao, PersonUtil personUtil) {
        this.personDao = personDao;
        this.personUtil = personUtil;
    }




    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public Person getById(String id) {
        return personDao.getById(personUtil.parseId(id));
    }
    public void setPersonUtil(PersonUtil personUtil) {
        this.personUtil = personUtil;
    }
}
