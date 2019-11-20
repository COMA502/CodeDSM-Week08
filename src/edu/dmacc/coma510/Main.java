package edu.dmacc.coma510;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * See the README.md or Blackboard for assignment instructions
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);

        System.out.print("\nDo you want to 'order' or 'add' to the menu? ");
        String operation = userInput.next();

        System.out.printf("Would you like 'breakfast' or 'dinner'? ");
        String meal = userInput.next();
        Menu menu = new Menu(meal);

        if (operation.equals("order")) {
            Waitress waitress = new Waitress();
            waitress.takeOrder(menu, userInput);
            waitress.printTotal();
        } else if (operation.equals("add")) {
            Manager manager = new Manager();
            manager.addToMenu(menu, userInput);
        } else {
            System.out.println(operation + " is not a valid option. Please enter 'order' or 'add' instead.");
        }
    }
}
