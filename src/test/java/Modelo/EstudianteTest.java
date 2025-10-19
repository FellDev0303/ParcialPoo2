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
public class EstudianteTest {

    @Test
    public void testDatosEstudiante() {
        Estudiante est = new Estudiante("A001", 4.5, "Pepesillo el morrillo", 16,
                "Cra 45 #32", "314789654", "2009-06-10");

        assertEquals("A001", est.toString().contains("Código: A001") ? "A001" : "", "El código del estudiante no se muestra correctamente");
        assertTrue(est.toString().contains("Promedio: 4.5"), "El promedio del estudiante no se muestra correctamente");
    }

}
