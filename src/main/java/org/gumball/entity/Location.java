package org.gumball.entity;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    private Long latitude;
    private Long longitude;
}
