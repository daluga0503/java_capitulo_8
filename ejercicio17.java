import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número binario: ");
        int numero = sc.nextInt();
        int longitud=matematicas.funciones.digitos(numero);
        int resultado=0;
        
        for(int i = 0; i<=longitud; i++){
            int v = matematicas.funciones.digitoN(numero, longitud-i-1);
            resultado+=v*matematicas.funciones.potencia(2, i);
        }
        System.out.printf("EL valor %d en binarios es el valor %d en decimal\n",numero,resultado);
        sc.close();
    }
}
