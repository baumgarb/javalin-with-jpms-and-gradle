package org.example.services.inmemory;

import org.example.models.Person;
import org.example.services.api.PersonFilter;
import org.example.services.api.PersonReader;

import java.util.List;
import java.util.ServiceLoader;

public class InMemoryPersonReader implements PersonReader {

    private PersonFilter filter;

    public InMemoryPersonReader(PersonFilter filter) {
        this.filter = filter;
    }

    @Override
    public List<Person> getAll() {
        return List.of(
            new Person("Vincent Vega", 73),
            new Person("Jules Winnfield", 12)
        ).stream().filter(this.filter::filter).toList();
    }

    public static PersonReader provider() {
        return new InMemoryPersonReader(
                ServiceLoader.load(PersonFilter.class).findFirst().get()
        );
    }
}
