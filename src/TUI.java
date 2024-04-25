import java.util.Scanner;

public class TUI{
    static Scanner sc = new Scanner(System.in);


    public static void gameMenu() {
        System.out.println("Benvingut al joc!");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }

    public static void newGame() {

    }

    public static void saveGame() {

    }

    public static void configure() {

    }

    public static void exitGame() {

    }

    public static void errorGame() {}


        public static void mostrarMenu() {
            while (true) {
                TUI.gameMenu();
                System.out.print("Selecciona una opció: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Has seleccionat Nova partida.");;
                        break;
                    case 2:
                        System.out.println("Has seleccionat Carregar partida.");
                        break;
                    case 3:
                        System.out.println("Has seleccionat Configuració.");
                        break;
                    case 4:
                        System.out.println("Has seleccionat Sortir. Fins aviat!");
                        break;
                    default:
                        System.out.println("Opció invàlida. Torna a intentar.");
                        break;
                }
            }
        }
    public static void mostrarTaulell() {}
    public static void recollirJugada() {}
    public static void fiDePartida() {}
    }


