package com.fifatourney.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Club implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String image;

    public Club(String name) {
        this.name = name;
    }

    public Club() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                '}';
    }
}
