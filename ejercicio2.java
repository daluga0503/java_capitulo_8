
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número y te diré si es primo o no: ");
    int numero=sc.nextInt();
    if(matematicas.funciones.esPrimo(numero)){
        System.out.println(numero+" es primo");
    }else{
        System.out.println(numero+" no es primo");
        }
    sc.close();
    }
}
