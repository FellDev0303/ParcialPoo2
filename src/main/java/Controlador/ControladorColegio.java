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
    
    public void registrarEstudiante(){
    String nombre =  JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
    String direccion = JOptionPane.showInputDialog("Ingrese la dirección del estudiante:");
    String telefono = JOptionPane.showInputDialog("Ingrese el número de telefono de los padres del estudiante: ");
    String nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del estudiante: ");
    String codigo = JOptionPane.showInputDialog("Ingrese el código del estudiante: ");
    double promedio = Double.parseDouble("Ingrese el promedio del estudiante "
            +"\ningresar '0' si es un nuevo ciclo escolar");
    
    Estudiante e = new Estudiante(codigo, promedio, nombre, edad, direccion, telefono, nacimiento);
    estudiantes.add(e);
    JOptionPane.showMessageDialog(null, "Estudiante Registrado correctamente.");
    } 
}
