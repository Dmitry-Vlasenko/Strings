package app.utils;

import java.util.ArrayList;

public class PrintWithNumberInColumn {

    public static void printWithNumberInColumn(ArrayList<String> wordsList) {
        int startNum = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordsList) {
            stringBuilder.append(startNum)
                    .append(": ")
                    .append(word)
                    .append("\n");
            startNum++;
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }
}