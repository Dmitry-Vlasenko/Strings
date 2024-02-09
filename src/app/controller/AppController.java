package app.controller;

import app.view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppController {
    private static final String menu = """
            1) Task 1
            2) Task 2
            3) Task 3
            4) Exit
            """;

    static Scanner scanner = new Scanner(System.in);

    public void Processing() {
        while (true) {
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        View.processingTaskOne();
                        break;
                    case 2:
                        View.processingTaskTwo();
                        break;
                    case 3:
                       View.processingTaskThree();
                        break;
                    case 4:
                        System.out.println("Exiting");
                        scanner.close();
                        return;
                }
            } catch (InputMismatchException error) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}