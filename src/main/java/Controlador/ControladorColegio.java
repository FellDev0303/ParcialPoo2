/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class ControladorColegio {
    private ArrayList<Profesor> profesores=  new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public void registrarProfesor(){
    String nombre= JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del profesor: "));
    String direccion = JOptionPane.showInputDialog("Ingrese la dirección del profesor: ");
    String telefono = JOptionPane.showInputDialog("Ingrese el # de teléfono del profesor:");
    String nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del profesor:  "));
    String area= JOptionPane.showInputDialog("En que área trabaja el profesor?: ");
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora: "));
    double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas dictadas: "));
    
    Profesor p = new Profesor(cedula, area, salario, horas, nombre, edad, direccion, telefono, nacimiento);
    profesores.add(p);
    JOptionPane.showInputDialog("Profesor Registrado correctamente.");
    }
    
}
