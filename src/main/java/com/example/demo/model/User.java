package com.example.demo.model;

import java.util.List;

public class User extends Person{

    private final String id;
    private String name;
    List<Contest> contests;
    private int score;

    public User(String id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public void create() {

    }

    public void registerContest() {

    }

    public void withdrawContest() {

    }

    public int getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
