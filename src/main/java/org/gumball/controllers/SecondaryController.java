package org.gumball.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.gumball.App;
import org.gumball.events.EventBus;
import org.gumball.events.LoadViewEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondaryController {
    @Autowired
    EventBus eventBus;

    @FXML
    private void switchToDashboard() throws IOException {
        LoadViewEvent playEvent = new LoadViewEvent("dashboard");
        eventBus.fireEvent(playEvent);
    }
}