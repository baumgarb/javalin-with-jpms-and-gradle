package org.example.services.api;

import org.example.models.Person;

public interface PersonFilter {
    boolean filter(Person p);
}
