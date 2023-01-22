package com.unisys.miapp;

public class PerroApp {
    public static void main( String[] args) {

        Perro toby = new Perro("Terrier");

        System.out.println(toby);

        toby.setRaza( "Terrier");

        System.out.println(toby.getRaza());

        Perro otto = new Perro("Pastor Aleman");

        System.out.println(otto);

        otto.setRaza( "Pastor Aleman");

        System.out.println(otto.getRaza());
        Perro fluky = new Perro("Pastor de aguas");
        fluky.setRaza("Pastor de aguas");
        System.out.println(fluky.getRaza());
    }
}



