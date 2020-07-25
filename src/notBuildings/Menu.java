package notBuildings;

import java.util.Scanner;

public class Menu {

    public static int choiceMenu() {
        Scanner scannerMenu = new Scanner(System.in);
        int choiceMenu = scannerMenu.nextInt();
        return choiceMenu;
    }
}
