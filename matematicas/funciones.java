package matematicas;

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
        for(i=1; i<=exponente; i++){
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

    public static int digitoN(int numero, int posicion){
        int digito=1;
        numero=voltea(numero);

        for(int i=0;i<=posicion;i++){
            numero/=10;
            if(i==posicion-1){
                digito=numero%10;
            }
        }
        return digito;
    }

    public static void posicionDeDigito(int numero, int digito){
        numero=voltea(numero);
        int contador=digitos(numero);
        int copia = contador;
        boolean salir = true;

        while (salir) {
            if(numero%10==digito){
                salir=false;
            }
            contador--;
            numero/=10;
            if(contador==0){
                salir=false;
            }
        }

        if(contador==0){
            System.out.println("-1");
        }else{
            System.out.println("La posición es la: "+(copia-contador));
            }
    }

        public static int quitaPorDetras(int numero, int digito){
            for(int i = 1; i<=digito; i++){
                numero=numero/10;
            }
            return numero;
        }

        public static int quitaPorDelante(int numero, int digito){
            numero=voltea(numero);

            numero=quitaPorDetras(numero, digito);

            numero=voltea(numero);

            return numero;
        }


        public static int pegaPorDetras(int numero, int digito){
            numero=numero*10+digito;
            return numero;
        }

        public static int pegaPordelante(int numero, int digito){
            numero=voltea(numero);
            numero=pegaPorDetras(numero, digito);
            numero=voltea(numero);
            
            return numero;
        }


        public static int juntaNumeros(int numero1, int numero2){
            int digitos=digitos(numero2);
            return numero1*(int)(Math.pow(10, digitos))+numero2;
        }
    
        public static int trozoDeNumero(int numero, int principio,int fin){
    
            int ultimo=digitos(numero)-fin;
    
            numero=quitaPorDelante(numero,principio);
    
            numero=quitaPorDetras(numero, ultimo);
    
            return numero;
        }



        




}
