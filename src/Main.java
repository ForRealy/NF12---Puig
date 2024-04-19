import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (true) {
            TUI.gameMenu();
            System.out.print("Selecciona una opció: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    TUI.newGame();
                    break;
                case 2:
                    TUI.saveGame();
                    break;
                case 3:
                    TUI.configure();
                    break;
                case 4:
                    TUI.exitGame();
                    break;
                default:
                    TUI.errorGame();
                    break;
            }
        }
    }
}
