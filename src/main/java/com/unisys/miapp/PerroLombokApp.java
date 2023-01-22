package com.unisys.miapp;

public class PerroLombokApp {
    public static void main(String[] args) {
        PerroLombok perroLombok = new PerroLombok("Pastor de Aguas");
        perroLombok.setRaza("Pastor de Aguas");
        System.out.println(perroLombok.getRaza());
        System.out.println(perroLombok);
        System.out.println("fin");
        perroLombok = new PerroLombok();
        perroLombok.setRaza("Pastor Aleman");
    }
}
