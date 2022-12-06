import java.util.Scanner;

import matematicas.funciones;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero=sc.nextInt();
        System.out.print("Por donde quieres cortar el numero \nLa primera posicion: ");
        int principio=sc.nextInt();
        System.out.print("La ultima posicion: ");
        int ultimo=sc.nextInt();
       
        System.out.println("El numero quedaria asi: "+funciones.trozoDeNumero(numero,principio,ultimo));

        sc.close();
    }
}
