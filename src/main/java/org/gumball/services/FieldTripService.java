package org.gumball.services;

import org.gumball.entity.Location;
import org.gumball.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FieldTripService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> getLocation() {
        return locationRepository.findAll();
    }
}
