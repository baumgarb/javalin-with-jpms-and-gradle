package org.example.services.filter;

import org.example.models.Person;
import org.example.services.api.PersonFilter;

public class AtLeastEighteenFilter implements PersonFilter {
    @Override
    public boolean filter(Person p) {
        return p.getAge() >= 18;
    }
}
