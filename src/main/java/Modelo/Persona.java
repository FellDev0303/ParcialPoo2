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

    protected String nombre;
    protected int edad;
    protected String direccion;
    protected String telefono;
    protected String nacimiento;

    public Persona(String nombre, int edad, String direccion, String telefono, String nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre 
                + "\n Dirección: " + direccion 
                + "\n Telefóno " + telefono
                + "\n Fecha de nacimiento: " + nacimiento;
    }

    @Override
    public String toString() {
        return obtenerDatos();
    }

}
