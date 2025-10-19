/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Profesor extends Persona{
    int cedula;
    String areaTrabajo;
    double salarioHora;
    double horasDictadas;

    public Profesor(int cedula, String areaTrabajo, double salarioHora, double horasDictadas, String nombre, int edad, String direccion, String telefono, String nacimiento) {
        super(nombre, edad, direccion, telefono, nacimiento);
        this.cedula = cedula;
        this.areaTrabajo = areaTrabajo;
        this.salarioHora = salarioHora;
        this.horasDictadas = horasDictadas;
    }
    
    public double calcularSalario(){
     return salarioHora * horasDictadas ;
    }
    
    
    
    
    
}
