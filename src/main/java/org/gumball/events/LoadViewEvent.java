package org.gumball.events;

import javafx.event.ActionEvent;


public class LoadViewEvent extends ActionEvent {

    private String viewName = "";

    public LoadViewEvent(String arg) {
        viewName = arg;
    }

    public String getViewName() {
        return viewName;
    }
}
