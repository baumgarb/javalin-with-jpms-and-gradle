import org.example.services.api.PersonReader;
import org.example.services.inmemory.InMemoryPersonReader;

module org.example.services {
    exports org.example.services.api;

    requires org.example.models;

    provides PersonReader with InMemoryPersonReader;
}