package com.unisys.miapp;

import lombok.Data;

@Data
public class  Estatica {
    public static float pi;

    public static void setPi(float pi) {
        Estatica.pi = pi;

        System.out.println(setPi(float pi));
    }
}
