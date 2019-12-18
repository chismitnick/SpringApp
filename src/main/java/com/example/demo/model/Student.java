package com.example.demo.model;

import java.util.UUID;

/*
 * model class implementation, The aim of the project is to implement the project using N-tier architecture
 * to enforce The separation of concerns technique
 * csamiselo@github December 2019
 * */

public class Student {
    private final UUID id;
    private final String first_name;
    private final String last_name;
    private final String course;

    public Student(UUID id, String first_name, String last_name, String course) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCourse() {
        return course;
    }
}
