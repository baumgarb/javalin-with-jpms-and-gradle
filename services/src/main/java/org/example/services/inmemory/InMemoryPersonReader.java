package org.example.services.inmemory;

import org.example.models.Person;
import org.example.services.api.PersonReader;

import java.util.List;

public class InMemoryPersonReader implements PersonReader {
    @Override
    public List<Person> getAll() {
        return List.of(
            new Person("Vincent Vega", 73),
            new Person("Jules Winnfield", 12)
        );
    }
}
