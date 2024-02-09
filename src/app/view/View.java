package app.view;

import app.model.TaskOne;
import app.model.TaskThree;
import app.model.TaskTwo;
import app.utils.PrintHashTable;
import app.utils.PrintWithNumberInColumn;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public static void processingTaskOne() {
        ArrayList<String> taskOneResult = TaskOne.correctMistake();
        PrintWithNumberInColumn.printWithNumberInColumn(taskOneResult);
    }

    public static void processingTaskTwo() {
        ArrayList<String> taskTwoResult = TaskTwo.removeOnion();
        PrintWithNumberInColumn.printWithNumberInColumn(taskTwoResult);
    }

    public static void processingTaskThree() {
        System.out.print("Input find name: ");
        String findName = scanner.nextLine();
        Hashtable<String, Integer> findResult = TaskThree.checkIfNameInArray(findName);
        PrintHashTable.printHashTable(findResult, "The name not found");
    }
}