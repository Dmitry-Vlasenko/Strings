package app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwo {
    private static final String[] wordsArrayTaskTwo = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};

    public static ArrayList<String> removeOnion() {
        List<String> wordList = new ArrayList<>(Arrays.asList(wordsArrayTaskTwo));
        while (wordList.remove("onion")) ;
        return (ArrayList<String>)wordList;
    }
}
