package org.gumball.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.gumball.events.EventBus;
import org.gumball.events.LoadViewEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DashboardController {
    @Autowired
    EventBus eventBus;

    @FXML
    private void locations() throws IOException {
        LoadViewEvent playEvent = new LoadViewEvent("locations");
        eventBus.fireEvent(playEvent);
    }

    @FXML
    private void trips() throws IOException {
        LoadViewEvent playEvent = new LoadViewEvent("trips");
        eventBus.fireEvent(playEvent);
    }

    @FXML
    private void calendar() throws IOException {
        LoadViewEvent playEvent = new LoadViewEvent("calendar");
        eventBus.fireEvent(playEvent);
    }
}
