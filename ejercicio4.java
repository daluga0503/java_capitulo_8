import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente=sc.nextInt();
        
        System.out.println("La potencia del número introducido es: " + matematicas.funciones.potencia(base,exponente));
        sc.close();
    }
}
