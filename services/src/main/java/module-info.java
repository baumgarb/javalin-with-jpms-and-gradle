module org.example.services {
    exports org.example.services.api;
    exports org.example.services.inmemory;

    requires org.example.models;
}