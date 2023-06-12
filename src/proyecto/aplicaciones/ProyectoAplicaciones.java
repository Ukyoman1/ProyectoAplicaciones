package proyecto.aplicaciones;

import java.util.Scanner;

public class ProyectoAplicaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        ImprimirNumeros nm3 = new ImprimirNumeros(numero1, numero2);
        
        nm3.imprimesionNumeros();

        System.out.println("El primer numero ingresado es: " + nm3.getNumero1);
        System.out.println("El segundo numero ingresado es: " + nm3.getNumero2);
    }

}
