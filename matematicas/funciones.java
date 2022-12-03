package java_capitulo_8.matematicas;

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
        return numero -1;
    }


    





}
