package com.unisys.miapp;

public class Ejercicio06 {

    public static void main(String[] args) {
        int i = 21;

        switch (i) {
            case 18:
                System.out.println("Puede conducir");
                break;
            case 21:
                System.out.println("Puede beber en USA");
                break;
            default:
                System.out.println("Pinta la edad i = " + i);
                break;
        }
    }
}
