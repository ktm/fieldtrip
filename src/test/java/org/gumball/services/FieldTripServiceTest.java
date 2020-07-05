package org.gumball.services;

import org.gumball.SpringBootBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FieldTripServiceTest extends SpringBootBaseTest {
    @Autowired
    FieldTripService fieldTripService;

    @Test
    void findAllService() {
        List list = fieldTripService.getLocation();
        assert list != null;
        assert list.size() > 0;
    }
}
