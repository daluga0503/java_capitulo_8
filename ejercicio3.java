import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un núemero y te diré el siguiente número pirmo correspondiente: ");
        int numero= sc.nextInt();
        
        System.out.println("El siguiente número primo es : " + matematicas.funciones.siguientePrimo(numero));
        sc.close();
    }
}
