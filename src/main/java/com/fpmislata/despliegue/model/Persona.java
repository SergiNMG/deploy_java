package com.fpmislata.despliegue.model;
public class Persona {
    private int edad;
    private String nombre;
    private String funcion;

    public Persona(int edad, String nombre, String funcion) {
        this.edad = edad;
        this.nombre = nombre;
        this.funcion = funcion;
    }

    public Persona(){

    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
