import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (true) {
            gameMenu();
            System.out.print("Selecciona una opció: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    newGame();
                    break;
                case 2:
                    saveGame();
                    break;
                case 3:
                    configure();
                    break;
                case 4:
                    exitGame();
                    break;
                default:
                    errorGame();
                    break;
            }
        }
        //sc.close();
    }

    public static void gameMenu() {
        System.out.println("Benvingut al joc!");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
    }

    public static void newGame() {
        System.out.println("Has seleccionat Nova partida.");
    }

    public static void saveGame() {
        System.out.println("Has seleccionat Carregar partida.");
    }

    public static void configure() {
        System.out.println("Has seleccionat Configuració.");
    }

    public static void exitGame() {
        System.out.println("Has seleccionat Sortir. Fins aviat!");
    }

    public static void errorGame() {
        System.out.println("Opció invàlida. Torna a intentar.");
    }
}
