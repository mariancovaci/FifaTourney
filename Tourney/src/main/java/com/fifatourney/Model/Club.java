package com.fifatourney.Model;

public class Club {
    private String name;
    private String image;

    public Club(String name) {
        this.name = name;
    }

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
