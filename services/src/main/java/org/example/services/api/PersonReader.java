package org.example.services.api;

import org.example.models.Person;

import java.util.List;

public interface PersonReader {
    List<Person> getAll();
}
