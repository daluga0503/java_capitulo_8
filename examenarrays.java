import java.util.Scanner;




public class examenarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char array [][] = new char [11][11];
        char arrayAux [][] = new char [11][11];
        int longitud = array.length;
        int x = 5;
        int y = 5;
        char cabezal = 'M';
        char opcion = 'x';
        int i = 0;
        int j = 0;
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                array[i][j] = ' ';
            }
        }
        do {
            for (i = 0; i < longitud; i++) {
                for (j = 0; j < longitud; j++) {
                    if (i == 0 || j == 0 || i == longitud - 1 || j == longitud - 1) {
                        System.out.print("* ");
                    } else if (y == i && x == j) {
                        System.out.print(cabezal + " ");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("a. Izquierda");
            System.out.println("d. Derecha");
            System.out.println("s. Abajo");
            System.out.println("w. Arriba");
            System.out.println("p. Pintar");
            System.out.println("b. Borrar");
            System.out.println("m. Mover");
            System.out.println("r. Rotar sentido antihorario");
            System.out.println("e. Espejo horizontal");
            System.out.println("l. Limpiar tablero");
            System.out.println("q. Salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'a':
                if (cabezal == 'P') {
                    array[y][x] = 'X';
                } else if (cabezal == 'B') {
                    array[y][x] = ' ';
                }
                if (x == 1) {
                    x = 1;
                } else {
                    x--;
                }
                    break;
                case 'd':
                if (cabezal == 'P') {
                    array[y][x] = 'X';
                } else if (cabezal == 'B') {
                    array[y][x] = ' ';
                }
                if (x == longitud - 2) {
                    x = longitud - 2;
                } else {
                    x++;
                }
                    break;
                case 's':
                if (cabezal == 'P') {
                    array[y][x] = 'X';
                } else if (cabezal == 'B') {
                    array[y][x] = ' ';
                }
                if (y == longitud - 2) {
                    y = longitud - 2;
                } else {
                    y++;
                }
                    break;
                case 'w':
                if (cabezal == 'P') {
                    array[y][x] = 'X';
                } else if (cabezal == 'B') {
                    array[y][x] = ' ';
                }
                if (y == 1) {
                    y = 1;
                } else {
                    y--;
                } 
                    break;
                case 'p':
                    cabezal = 'P';
                    break;
                case 'b':
                    cabezal = 'B';
                    break;
                case 'm':
                    cabezal = 'M';
                    break;
                case 'r':
                    for (i = 0; i < longitud; i++) {
                        for (j = 0; j < longitud; j++) {
                            arrayAux[longitud -j - 1][i] = array[i][j];
                        }
                    }
                    for (i = 0; i < longitud; i++) {
                        for (j = 0; j < longitud; j++) {
                            array[i][j] = arrayAux[i][j];
                        }
                    }
                    break;
                case 'e':
                    
                    break;
                case 'l':
                    for (i = 0; i < longitud; i++) {
                        for (j = 0; j < longitud; j++) {
                            array[i][j] = ' ';
                        }
                    }
                    break;
                case 'q':

                    break;
                default:
            }   
        } while (opcion != 'q');
        sc.close();
    }
}

