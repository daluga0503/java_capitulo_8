import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y un dígito que quieras añadirle por delante");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Dígito: ");
        int digitos = sc.nextInt();

        System.out.println(matematicas.funciones.pegaPordelante(numero, digitos));


        sc.close();
    }
}
