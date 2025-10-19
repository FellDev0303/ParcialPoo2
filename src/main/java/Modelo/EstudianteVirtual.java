/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class EstudianteVirtual extends Estudiante {

    public EstudianteVirtual(String codigo, double promedio, String nombre, int edad, String direccion, String telefono, String nacimiento) {
        super(codigo, promedio, nombre, edad, direccion, telefono, nacimiento);
    }

    @Override
    public String obtenerModalidad() {
        return "Modalidad: Virtual";
    }
}
