package com.unisys.miapp;

public class Empleado {

    private String nombre;
    private String dni;
    private long telefono;
    private float sueldo;
    private String cargo;

    /*public static void main(String[] args) {

    }*/
    // Instanciamos el empleado sin valores o null
    public Empleado() {
        this.nombre = " ";
        this.dni = " ";
        this.telefono = 0;
        this.cargo = " ";
        this.sueldo = 0.0f;
    }

    public Empleado(String nombre, String dni, long telefono, String cargo, float sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public float getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }
}
