package org.gumball.services;

import org.gumball.entity.Location;
import org.gumball.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldTripService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> getLocation() {
        List<Location> retval = locationRepository.findAll();
        return retval;
    }
}
