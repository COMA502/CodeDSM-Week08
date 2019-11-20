package edu.dmacc.coma510;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

    public void addToMenu(Menu menu, Scanner userInput) throws FileNotFoundException {
        menu.showMenu();

        boolean done = false;
        while (!done) {
            System.out.print("What food would you like to add; enter 'done' when complete? ");
            String food = userInput.next();

            if (food.equals("done")) {
                done = true;
            } else {
                double price = getPriceFromUser(userInput);
                menu.addToMenu(food, price);
            }
        }

        menu.showMenu();
    }

    private double getPriceFromUser(Scanner userInput) {
        try {
            System.out.print("What's the price? ");
            return userInput.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("The price must be a number.");
            userInput.next();//clear the input
            return getPriceFromUser(userInput);
        }
    }
}
