/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Persona {

    int nombre;
    int edad;
    int direccion;
    int telefono;
    int nacimiento;

    public Persona(int nombre, int edad, int direccion, int telefono, int nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String ObtenerDatos() {
        return "Nombre: " + nombre 
                + "\n Dirección: " + direccion 
                + "\n Telefóno " + telefono
                + "\n Fecha de nacimiento: " + nacimiento;
    }

    @Override
    public String toString() {
        return ObtenerDatos();
    }

}
