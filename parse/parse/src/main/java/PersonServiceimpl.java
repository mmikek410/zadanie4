

import com.example.parse.Person;
import com.example.parse.PersonService;
import org.springframework.stereotype.Component;

@Component
class PersonServiceImpl implements PersonService {

    @Override
    public Person saveUpdatePerson(Person person) {
        return person;
    }

    @Override
    public Person findPersonById(Integer id) {
        return new Person(1,"John");
    }

}