module org.example.api {
    requires io.javalin;
    requires com.fasterxml.jackson.databind;
    requires org.slf4j;
    requires kotlin.stdlib;

    requires org.example.services;

    uses org.example.services.api.PersonReader;
}