/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class ProfesorTest {

    @Test
    public void testCalcularSalario() {
        Profesor profesor = new Profesor(12345, "Matemáticas", 50000, 40, 
                "Carlos Pérez", 45, "Calle 10 #23", "321654987", "1979-02-15");

        double esperado = 50000 * 40;
        assertEquals(esperado, profesor.calcularSalario(), "El salario calculado no es correcto");
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor profesor = new Profesor(12345, "Matemáticas", 50000, 40, 
                "Carlos Pérez", 45, "Calle 10 #23", "321654987", "1979-02-15");

        double esperado = profesor.calcularSalario() * 0.17;
        assertEquals(esperado, profesor.calcularPrestaciones(), "Las prestaciones no se calculan correctamente");
    }
    }
