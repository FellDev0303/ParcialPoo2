/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.uao.parcial2poo;

import Controlador.ControladorColegio;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ColegioApp {

    public static void main(String[] args) {
        ControladorColegio controlador = new ControladorColegio();
        int opcion = -1;
        do {
            try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÚ COLEGIO APP \n"
            + "1. Registrar Profesor \n"
                    + "2. Registrar Estudiante \n"
                    + "3. Mostrar Reporte de Profesores \n"
                    + "4. Mostrar Reporte de Estudiantes \n"
                    + "0. Salir del programa \n"
                    + "Seleccione una opción: "));
            
            switch (opcion){
                case 1 -> controlador.registrarProfesor();
                case 2 -> controlador.registrarEstudiante();
                case 3 -> controlador.mostrarProfesores();
                case 4 -> controlador.mostrarEstudiantes();
                case 0 -> {
                JOptionPane.showMessageDialog(null, "Gracias por usar Colegio Claret APP :D! ");
                System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opción invalida, intente de nuevo.");
            }
            } catch  (NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
            }
            
        } while (true);
        
    }
}
