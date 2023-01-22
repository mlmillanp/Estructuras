package com.unisys.miapp;

public class Perro {
    private String raza;

    public Perro() {
        this.raza = "";
    }
    public Perro(String raza) {
        this.raza = raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
