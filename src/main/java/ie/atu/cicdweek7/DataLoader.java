package ie.atu.cicdweek7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address1 = new Address("Galway", "H91XX00");
        Person testData = new Person("Paul", "Lecturer", "1234", "paul@atu.ie", "Electronics", address1);
        // Address 2
        Address a2 = new Address("Mayo", "F23X123");
        Person testData2 = new Person("Pat", "Lecturer", "1234", "paul@atu.ie", "Electronics", a2);
        Address a3 = new Address("Clare", "F23X123");
        Person testData3 = new Person("Saul", "Lecturer", "1234", "paul@atu.ie", "Electronics", a3);
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
