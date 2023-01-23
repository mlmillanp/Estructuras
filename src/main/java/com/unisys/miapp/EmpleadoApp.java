package com.unisys.miapp;

public class EmpleadoApp {
    public static void main(String[] args) {

        Empleado unisys1 = new Empleado();
        System.out.println(unisys1);
        Empleado unisys2 = new Empleado();
        unisys2.setNombre("Iria");
        unisys2.setDni("1111111H");
        unisys2.setTelefono(912564378);
        unisys2.setCargo("Advo.");
        unisys2.setSueldo(1200.0F);
        System.out.println("Nombre: " + unisys2.getNombre() + "" +
    "DNI: " + unisys2.getDni() + " Telefono: " + unisys2.getTelefono() + " Puesto: "
        + unisys2.getCargo() + " Sueldo: " +  unisys2.getSueldo());
    }
}
