package com.stackroute.domain;
import com.stackroute.domain.Actor;

public class Movie {
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {

    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
