
import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número y te diré si es capicua o no: ");
        int numero=sc.nextInt();

        if(matematicas.funciones.esCapicua(numero)){
            System.out.println(numero+" es capicua.");
        }else{
            System.out.println(numero+ " no es capicua.");
        }
        sc.close();
    }
}