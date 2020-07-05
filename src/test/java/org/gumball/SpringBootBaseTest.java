package org.gumball;

import javafx.embed.swing.JFXPanel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootBaseTest {

    static {
        // Instantiate a JFXPanel to bootstrap the javaFX stuff.
        JFXPanel noop = new JFXPanel();
    }

    @Test
    void contextLoads() {
    }
}