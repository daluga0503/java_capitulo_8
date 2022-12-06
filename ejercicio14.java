import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números par después juntralos");
        System.out.print("Número1: ");
        int numero1=sc.nextInt();
        System.out.print("Número 2: ");
        int numero2=sc.nextInt();

        System.out.println("Resultado de la unión: "+matematicas.funciones.juntaNumeros(numero1, numero2));


        sc.close();
    }
}
