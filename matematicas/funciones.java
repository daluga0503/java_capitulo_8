package matematicas;

import java.util.function.LongFunction;

public class funciones{

public static int voltea(int x){
    int volteado=0;
    while(x>0){
        volteado=(volteado*10)+x%10;
        x=x/10;
        }
        return volteado;
    }


    public static boolean esCapicua(int x){
        if(voltea(x)==x){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esPrimo(int x){
        for(int i = 2; i<=x/2; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x){
        int numero = x+1;
        boolean salir = true;
        while(salir){
            if(esPrimo(numero)){
                salir=false;
            }
            numero++;
        }
        return numero-1;
    }

    public static long potencia(int base, int exponente){
        long suma=1;
        int i=0;
        for(i=1; i<exponente; i++){
            suma=suma*base;
        }
        return suma;
    }

    public static int digitos(int x){
        int longitud=0;
        while(x>0){
            x=x/10;
            longitud++;
        }
        return longitud;
    }

    public static int digitoN(int x, int posicion){
        int digito=1;
        x=voltea(x);

        for(int i=0;i<=posicion;i++){
            x/=10;
            if(i==posicion-1){
                digito=x%10;
            }
        }
        return digito;
    }



}
