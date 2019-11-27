package com.company.labs.lab2;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class WordCounter {
    String sourceString;
    private int countOfWords = 0;
    private int countOfUniqueWords = 0;
    String [] splittedWords;
    HashMap < String, Integer> uniqueWordsMap = new HashMap();

    public WordCounter(String inputString) {
        //countOfUniqueWords = count(inputString);

//        sourceString = inputString.trim();
//        splittedWords = sourceString.split("\\s+");
//        countOfWords = splittedWords.length;
//
//        for (String word : splittedWords) {
//            if (!uniqueWordsMap.containsKey(word)) {
//                uniqueWordsMap.put(word, 0);
//            }
//            uniqueWordsMap.put(word, uniqueWordsMap.get(word) + 1);
//        }
//        return uniqueWordsMap.size();
    }

    public static int count(String inputString) {
        String sourceString = inputString.trim();
        sourceString = sourceString.replaceAll("[^a-zA-Z\\s]", "");

        if (sourceString.equals("")) {
            return 0;
        }

        String [] splittedWords = sourceString.split("\\s+");
        int countOfWords = splittedWords.length;

        Map<String, Integer> uniqueWordsMap = new HashMap<>();

        for (String word : splittedWords) {
            if (!uniqueWordsMap.containsKey(word)) {
                uniqueWordsMap.put(word, 0);
            }
            uniqueWordsMap.put(word, uniqueWordsMap.get(word) + 1);
        }
        return uniqueWordsMap.size();
    }

    public void printMessageInfo(){
        System.out.println("The message contains " + this.countOfWords + " words and " + this.uniqueWordsMap.size() + " unique words");

        for (String word : uniqueWordsMap.keySet()){
            System.out.println(" " + word + " : " + uniqueWordsMap.get(word) + " times");
        }
    }


    public static void main(String[] args) {
        String inputString = "   xxx   ooo xxx    ";
        WordCounter counterInstance = new WordCounter("   X");
        counterInstance.printMessageInfo();
    }
}
