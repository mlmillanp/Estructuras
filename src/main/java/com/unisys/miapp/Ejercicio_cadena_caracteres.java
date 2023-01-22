package com.unisys.miapp;

public class Ejercicio_cadena_caracteres {

    public static void main(String[] args) {

        String saludo = "Hola";

            System.out.println( saludo );

        System.out.println(saludo.length());

        char c1=saludo.charAt(3);
        System.out.println(c1);
        System.out.println(saludo.toLowerCase());

        String saludo2 = "Adios";

        if(saludo==saludo2){
            System.out.println("Ambas referencias son iguales");
        }else{
            System.out.println("Ambos saludos son distintos o ambas referencias son distintas");
        }
        int i = saludo.indexOf('l');

        System.out.println(i);
        }
    }

