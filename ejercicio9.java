import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y lso dígitos que quieras quitarle por detrás");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Dígitos: ");
        int digitos = sc.nextInt();

        System.out.println(matematicas.funciones.quitaPorDetras(numero, digitos));
        sc.close();
    }
}
