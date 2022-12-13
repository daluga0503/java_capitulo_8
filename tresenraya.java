import java.util.Scanner;

public class tresenraya {
    public static void inicializar(char[][] tablero){
        int i = 0;
        int j = 0;
        for(i = 0; i < tablero.length; i++){
            for(j = 0; j < tablero[i].length;j++){
                tablero[i][j] = ' ';
            }
        }
    }

    public static String obtenerTirada(char[][] tablero, Scanner sc){
        String tirada = "";
        boolean correcto = false;
        do {
            System.out.print("Realice una tirada (Ej. b1): ");
            String line = sc.next();
            char fil = line.charAt(0);
            char col = line.charAt(1);
            if(tablero[fil-'a'][col-'1']==' '){
                correcto = true;
                tirada = ""+fil+col;
            }
            else
                System.out.println("La casilla está ocupada");
        } while (!correcto);
        return tirada;
    }

    public static String obtenerTiradaAleatoria(char[][] tablero){
        String tirada = "";
        boolean correcto = false;
        do {
            int fil = (int)(Math.random()*3);
            int col = (int)(Math.random()*3);
            if(tablero[fil][col]==' '){
                correcto = true;
                tirada = ""+ (char)(fil+'a') +(char)(col+'1');
            }
        } while (!correcto);
        return tirada;
    }

    public static void marcarTirada(char[][] tablero, String tirada, char jugador){
        int fil = tirada.charAt(0)-'a';
        int col = tirada.charAt(1)-'1';
        tablero[fil][col]=jugador;
    }

    public static void imprimirTablero(char[][] tablero){
        System.out.println("  *************");
        for(int i = 2; i >= 0; i--){
            System.out.printf("%s *", ""+(char)('a'+i));
            for(int j= 0; j < 3; j++){
                System.out.printf(" %s *", tablero[i][j]);
            }
            System.out.println("\n  *************");
        }
    }

    
    public static int comprobarJugada(char[][] tablero){ 
        if((tablero[0][0] == 'X') && (tablero[0][1] == 'X') && (tablero[0][2] == 'X'))
            return 1;
        if((tablero[0][0] == 'O') && (tablero[0][1] == 'O') && (tablero[0][2] == 'O'))
            return 2;
        if((tablero[1][0] == 'X') && (tablero[1][1] == 'X') && (tablero[1][2] == 'X'))
            return 1;
        if((tablero[1][0] == 'O') && (tablero[1][1] == 'O') && (tablero[1][2] == 'O'))
            return 2;
        if((tablero[2][0] == 'X') && (tablero[2][1] == 'X') && (tablero[2][2] == 'X'))
            return 1;
        if((tablero[2][0] == 'O') && (tablero[2][1] == 'O') && (tablero[2][2] == 'O'))
            return 2;
        if((tablero[0][0] == 'X') && (tablero[1][0] == 'X') && (tablero[2][0] == 'X'))
            return 1;
        if((tablero[0][0] == 'O') && (tablero[1][0] == 'O') && (tablero[2][0] == 'O'))
            return 2;
        if((tablero[0][1] == 'X') && (tablero[1][1] == 'X') && (tablero[2][1] == 'X'))
            return 1;
        if((tablero[0][1] == 'O') && (tablero[1][1] == 'O') && (tablero[2][1] == 'O'))
            return 2;
        if((tablero[0][2] == 'X') && (tablero[1][2] == 'X') && (tablero[2][2] == 'X'))
            return 1;
        if((tablero[0][2] == 'O') && (tablero[1][2] == 'O') && (tablero[2][2] == 'O'))
            return 2;
        if((tablero[0][0] == 'X') && (tablero[1][1] == 'X') && (tablero[2][2] == 'X'))
            return 1;
        if((tablero[0][0] == 'O') && (tablero[1][1] == 'O') && (tablero[2][2] == 'O'))
            return 2;
        if((tablero[2][0] == 'X') && (tablero[1][1] == 'X') && (tablero[0][2] == 'X'))
            return 1;
        if((tablero[2][0] == 'O') && (tablero[1][1] == 'O') && (tablero[0][2] == 'O'))
            return 2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        char jugador1 = 'X';
        char jugador2 = 'O';
        inicializar(tablero);
        int movimientos = 0;
        int jugadaGanadora = 0;
        do {
            imprimirTablero(tablero);
            marcarTirada(tablero, obtenerTirada(tablero, sc), jugador1);
            movimientos++;
            jugadaGanadora = comprobarJugada(tablero);
            if(jugadaGanadora == 0){
                marcarTirada(tablero, obtenerTiradaAleatoria(tablero), jugador2);
                movimientos++;
                jugadaGanadora = comprobarJugada(tablero);
            }
        } while (movimientos!=9 && jugadaGanadora==0);
        imprimirTablero(tablero);
        switch(jugadaGanadora){
            case 0:
                System.out.println("La partida ha terminado en empate");
                break;
            case 1:
                System.out.println("Enhorabuena Jugador!!!, Has ganado");
            break;
            case 2:
                System.out.println("Lo siento. Has perdido");
            break;
            default:
                break;
        }
    }
}
