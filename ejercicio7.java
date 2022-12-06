import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero=sc.nextInt();
        System.out.print("Introduce la posición del que quieres saber su dígito: ");
        int posicion=sc.nextInt();

        System.out.println("La posición " + posicion + " tiene el dígito " + matematicas.funciones.digitoN(numero, posicion));
        sc.close();
    }
}
