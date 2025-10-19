/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Estudiante extends Persona {
    int padres;
    public Estudiante(int padres, int nombre, int edad, int direccion, int telefono, int nacimiento) {
        super(nombre, edad, direccion, telefono, nacimiento);
        this.padres = padres;
    }
    
}
