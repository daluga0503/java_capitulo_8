import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y los dígitos que quieras quitarle por delante");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Dígitos: ");
        int digitos = sc.nextInt();

        System.out.println(matematicas.funciones.quitaPorDelante(numero, digitos));
        sc.close();
    }
}
