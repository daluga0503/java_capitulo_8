import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        
        System.out.print("El número introducido tiene " + matematicas.funciones.digitos(numero)+" digitos. ");
        sc.close();

    }
}
