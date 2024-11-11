package com.endava.grocy.model;

public enum Entity {

    PRODUCTS("products"),
    CHORES("chores");

    private String name;

    private Entity(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
