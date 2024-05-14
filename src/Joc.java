public class Joc {
    public char[][] getTablero() {
        return tablero;
    }

    public int getTurno() {
        return turno;
    }

    private char[][] tablero;
    private int turno;

    public void novaPartida() {
        tablero = new char[3][3]; // Creamos un tablero de 3x3
        // Inicializamos el tablero con espacios en blanco
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        turno = 1; // Empezamos con el turno del jugador 1
    }

    public void jugar(int fila, int columna) {
        if (tablero[fila][columna] == ' ') {
            // Verificamos si es el turno del jugador 1 o 2
            char ficha = (turno == 1) ? 'X' : 'O';
            // Colocamos la ficha en la posición indicada
            tablero[fila][columna] = ficha;
            // Cambiamos al turno del siguiente jugador
            turno = (turno == 1) ? 2 : 1;
        } else {
            System.out.println("La casilla seleccionada ya está ocupada. Elige otra.");
        }
    }

    public boolean jugadaGuanyadora(int fila, int columna) {
        // Verificar si hay una fila completa con la misma ficha
        if (tablero[fila][0] == tablero[fila][1] && tablero[fila][1] == tablero[fila][2]) {
            return true;
        }
        // Verificar si hay una columna completa con la misma ficha
        if (tablero[0][columna] == tablero[1][columna] && tablero[1][columna] == tablero[2][columna]) {
            return true;
        }
        // Verificar si hay una diagonal completa con la misma ficha
        if ((fila == columna || fila + columna == 2) &&
                (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] ||
                        tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0])) {
            return true;
        }
        // Si no hay ninguna combinación ganadora, retornar false
        return false;
    }
}
