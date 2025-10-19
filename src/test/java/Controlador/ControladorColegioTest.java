/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Controlador.ControladorColegio;
import Modelo.Profesor;
import Modelo.Estudiante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class ControladorColegioTest {
    
    @Test
    public void testIntegracion() {
        ControladorColegio controlador = new ControladorColegio();

        Profesor profesor = new Profesor(
                12345, "Ciencias", 40000, 30,
                "Carlos Pérez", 40, "Calle 10 #23", "320654987", "1985-04-10"
        );

        Estudiante estudiante = new Estudiante(
                "E001", 4.2, "Laura Gómez", 16,
                "Cra 45 #12", "314987654", "2009-05-15"
        );

        controlador.agregarProfesorPrueba(profesor);
        controlador.agregarEstudiantePrueba(estudiante);

        assertEquals(1, controlador.contarProfesores(), "Debe haber 1 profesor registrado");
        assertEquals(1, controlador.contarEstudiantes(), "Debe haber 1 estudiante registrado");

        assertEquals(1_200_000, profesor.calcularSalario(), 0.1, "El salario debe ser correcto");
        assertTrue(estudiante.toString().contains("Laura Gómez"));
    }
}
