package com.unisys.miapp;

import java.util.Date;

public class GatoApp {
    public static void main(String[] args) {
        Gato minu = new Gato();
        System.out.println(minu);
        minu.setName("Minu");
        minu.setAge(12);
        minu.setBirthDate(new Date(2010,0,1));
        System.out.println(minu);
    }
}
