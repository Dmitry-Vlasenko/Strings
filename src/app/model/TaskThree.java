package app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class TaskThree {

    private static final String[] nameArray = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    static public ArrayList<String> namesList = new ArrayList<>(Arrays.asList(nameArray));

    public static Hashtable<String, Integer> checkIfNameInArray(String findName) {
        Hashtable<String, Integer> resultHashTable = new Hashtable<>();
        if (namesList.contains(findName)) {
            int countName = Collections.frequency(namesList, findName);
            resultHashTable.put(findName, countName);
        }
        return resultHashTable;
    }
}