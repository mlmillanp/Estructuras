package com.unisys.miapp;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class Gato {
    private String name;
    private Integer age;
    private Date birthDate;

    Gato(){
        this.age = 0;
        this.name = "";
        this.birthDate = new Date();
    }

}
