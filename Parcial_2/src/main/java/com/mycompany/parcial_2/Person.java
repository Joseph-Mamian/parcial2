package com.mycompany.parcial_2;

public class Person {
    String name;
    boolean rent;

    public Person(String name, boolean rent) {
        this.name = name;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
    
    
}
