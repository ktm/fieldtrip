package org.gumball;

import javafx.application.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="org.gumball.repository")
@EntityScan(basePackages="org.gumball.entity")
@EnableTransactionManagement
public class SpringBooter {
    public static void main(String[] args) {
        Application.launch(App.class, args);
    }
}
