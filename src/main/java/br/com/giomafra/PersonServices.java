package br.com.giomafra;

import br.com.giomafra.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public  List<Person> findAll(){
        logger.info("Finding all people");

        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }



    public Person findById(String id){
        logger.info("Finding one person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Giovanna");
        person.setAdress("Guarulhos-sp");
        person.setLastName("Mafra");
        person.setGender("Female");

        return person;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName: " + i);
        person.setAdress("Some adress in Brazil");
        person.setLastName("LastName: " + i);
        person.setGender("Female");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one person");
        return person;
    }

}
