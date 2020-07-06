package org.gumball.controllers;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.util.Callback;
import org.gumball.entity.Location;
import org.gumball.events.EventBus;
import org.gumball.events.EventTypes;
import org.gumball.events.LoadViewEvent;
import org.gumball.services.FieldTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

@Component
public class LocationController implements Initializable {
    public static final String VIEW_NAME = "locations";

    @Autowired
    EventBus eventBus;

    @Autowired
    FieldTripService fieldTripService;

    @FXML
    ListView<Location> locationsListView = new ListView<>();

    private final ViewHandler viewHandler = new ViewHandler();

    @FXML
    private void switchToDashboard() {
        LoadViewEvent playEvent = new LoadViewEvent("dashboard");
        eventBus.fireEvent(playEvent);
    }

    @Override public void initialize(URL url, ResourceBundle rb) {
        WeakEventHandler handler = new WeakEventHandler(viewHandler);
        eventBus.addListener(EventTypes.SHOW_VIEW, handler);

        locationsListView.setCellFactory(
                new Callback<ListView<Location>, ListCell<Location>>() {
                    @Override
                    public ListCell<Location> call(ListView<Location> list) {
                        return new LocationCell();
                    }
                }
        );

        List list = fieldTripService.getLocation();
        var observableList = FXCollections.observableList(list);
        locationsListView.setItems(observableList);
    }

    static class ViewHandler implements EventHandler<Event> {
        @Override
        public void handle(Event windowEvent) {
            if (VIEW_NAME.equals(windowEvent.getEventType().getName()))
                System.err.println("windowevent: " + windowEvent);
        }
    }

    static class LocationCell extends TextFieldListCell<Location> {
        @Override
        public void updateItem(Location item, boolean empty) {
            if (item != null) {
                setText(item.getName());
            }
            if (empty) {
                setText("");
            }
        }
    }
}