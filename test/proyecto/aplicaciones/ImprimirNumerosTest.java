/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto.aplicaciones;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ukyo
 */
public class ImprimirNumerosTest {
    @Test
    public void testImprimesionNumeros() {
        int numero1 = 3;
        int numero2 = 10;
        String expectedOutput = "Los números pares en el rango son:\n4\n6\n8\nNúmeros pares impresos: [4, 6, 8]\n";

        ImprimirNumeros imprimirNumeros = new ImprimirNumeros(numero1, numero2);

        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        imprimirNumeros.imprimesionNumeros();

        // Restaurar la salida estándar original
        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString());
    }

}
