module org.gumball {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
    requires spring.core;


    opens org.gumball to javafx.fxml, spring.core;
    opens org.gumball.controllers to javafx.fxml, spring.core, spring.beans;
    exports org.gumball;
    exports org.gumball.services;
    exports org.gumball.events;
}