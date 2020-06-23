package org.gumball.services;

import org.springframework.stereotype.Component;

@Component
public class ScoreService {
    public String getText() {
        return "This text is INJECTED";
    }
}
