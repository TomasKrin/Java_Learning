package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringTask5VJ implements TaskProcessor {
    static final String REVERSED_WORDS = "Reversed words: ";

    public String reverseString(String[] arr) {
        String[] reversed = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        return REVERSED_WORDS + String.join(" ", reversed);
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] arr = sentence.split("\\s+");
        System.out.println(reverseString(arr));
        sc.close();
    }
}
