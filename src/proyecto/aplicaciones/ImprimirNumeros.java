package proyecto.aplicaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ukyo Moreno
 */
public class ImprimirNumeros {
    int numero1;
    int numero2;

    // Es un contructor de la clase
    public ImprimirNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Este metodo regresa el primer numero
    public int getNumero1() {
        return numero1;
    }

    // Este metodo recupera y setea el primer numero
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    // Este metodo regresa el segundo numero
    public int getNumero2() {
        return numero2;
    }

    // Este metodo recupera y setea el segundo numero
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Este metodo verifica el orden de los números, ajustar el rango e imprimir los números pares en el rango
    public void imprimesionNumeros() {
        int inicio, fin;
        if (numero1 < numero2) {
            inicio = numero1 + 1;
            fin = numero2 - 1;
        } else {
            inicio = numero2 + 1;
            fin = numero1 - 1;
        }

        System.out.println("Los números pares en el rango son:");
        List<Integer> numerosPares = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                numerosPares.add(i);
            }
        }
        System.out.println("Números pares impresos: " + numerosPares);

    }

}
