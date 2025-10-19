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
        public static void main(String[] args) {
        Profesor profe = new Profesor(12345, "Matemáticas", 50000, 40, "Verónica", 35, "Calle 10 #23-45", "3201234567", "15/03/1989");

        double salarioEsperado = 50000 * 40;
        double salarioCalculado = profe.calcularSalario();
        double prestacionesEsperadas = salarioEsperado * 0.17;

        System.out.println("==== TEST PROFESOR ====");
        System.out.println("Salario esperado: " + salarioEsperado + " | Calculado: " + salarioCalculado);
        System.out.println("Prestaciones esperadas: " + prestacionesEsperadas + " | Calculadas: " + profe.calcularPrestaciones());

        if (salarioEsperado == salarioCalculado && prestacionesEsperadas == profe.calcularPrestaciones()) {
            System.out.println(" Test Profesor PASADO");
        } else {
            System.out.println(" Test Profesor FALLÓ");
        }
    }

    
}
