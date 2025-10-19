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
    private String codigo;
    private double promedio;

    public Estudiante(String codigo, double promedio, String nombre, int edad, String direccion, String telefono, String nacimiento) {
        super(nombre, edad, direccion, telefono, nacimiento);
        this.codigo = codigo;
        this.promedio = promedio;
    }
    
    @Override
    public String toString (){
            return super.toString()
                + "\nCódigo: " + codigo
                + "\nPromedio: " + promedio;
    }
}
