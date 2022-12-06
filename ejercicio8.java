import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número y un dígito que contenga y te diré cual es su primera posicion");
        System.out.print("Número: ");
        int numero=sc.nextInt();
        System.out.println("");
        System.out.print("Dígito: ");
        int digito=sc.nextInt();

        matematicas.funciones.posicionDeDigito(numero,digito);
        sc.close();

    }
}
