/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Profesor extends Persona {

    private int cedula;
    private String areaTrabajo;
    private double salarioHora;
    private double horasDictadas;

    public Profesor(int cedula, String areaTrabajo, double salarioHora, double horasDictadas, String nombre, int edad, String direccion, String telefono, String nacimiento) {
        super(nombre, edad, direccion, telefono, nacimiento);
        this.cedula = cedula;
        this.areaTrabajo = areaTrabajo;
        this.salarioHora = salarioHora;
        this.horasDictadas = horasDictadas;
    }

    public double calcularSalario() {
        return salarioHora * horasDictadas;
    }

    public double calcularSalario(double incentivo) {
        return (salarioHora * horasDictadas) + incentivo;
    }
    
    public double calcularPrestaciones(){
    return calcularSalario()*0.17;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Cédula: " + cedula
                + "\n Área de trabajo :" + areaTrabajo
                + "\n Salario base: $" + calcularSalario();
    }
}
