import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero=sc.nextInt();

        System.out.println("El número introducido volteado es el siguiente: " + matematicas.funciones.voltea(numero));
        sc.close();
    }
}
