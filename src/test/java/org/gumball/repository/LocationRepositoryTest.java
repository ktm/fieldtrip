package org.gumball.repository;

import org.gumball.SpringBootBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationRepositoryTest extends SpringBootBaseTest {
    @Autowired
    LocationRepository locationRepository;

    @Test
    void findAllRepository() {
        List list = locationRepository.findAll();
        assert list != null;
        assert list.size() > 0;
    }
}
