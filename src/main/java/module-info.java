module org.gumball {
    requires java.persistence;
    requires java.sql;
    requires java.transaction;
    requires java.instrument;

    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.hibernate.orm.core;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
    requires spring.core;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.tx;

    opens org.gumball to javafx.fxml, javafx.graphics, spring.core, spring.beans, spring.context;
    opens org.gumball.events to spring.beans;
    opens org.gumball.controllers to javafx.fxml, spring.core, spring.beans;
    opens org.gumball.services to spring.data.jpa, spring.core, spring.beans;
    opens org.gumball.entity to org.hibernate.orm.core, spring.core;
}