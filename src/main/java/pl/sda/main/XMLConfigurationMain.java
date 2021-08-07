package pl.sda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.model.Person;
import pl.sda.service.PersonService;
import pl.sda.service.impl.PersonServiceImpl;

public class XMLConfigurationMain {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       PersonService ps =
               ac.getBean("personServiceImpl", PersonServiceImpl.class);

       ps.getAll().forEach(System.out::println);

       Person person = ps.getById("2");

        System.out.println(person);

        ((ClassPathXmlApplicationContext) ac).close();
    }
}
