package com.company.labs.lab2;

import java.util.Scanner;
import java.util.HashMap;

public class WordCounter {
    String sourceString;
    int countOfWords = 0;
    int countOfUniqueWords = 0;
    String [] splittedWords;
    HashMap < String, Integer> uniqueWordsMap = new HashMap();

    public WordCounter(String inputString) {

        sourceString = inputString;
        splittedWords = sourceString.split("\\s");
        countOfWords = splittedWords.length;

        for (String word : splittedWords){
            if (!uniqueWordsMap.containsKey(word)) {
                uniqueWordsMap.put(word, 0);
            }
            uniqueWordsMap.put(word, uniqueWordsMap.get(word) + 1);
        }
    }

    public void printMessageInfo(){
        System.out.println("The message contains " + this.countOfWords + " words \n and " + this.uniqueWordsMap.size() + " unique words");

        for (String word : uniqueWordsMap.keySet()){
            System.out.println(" " + word + " : " + uniqueWordsMap.get(word) + " times");
        }
    }


    public static void main(String[] args) {
        String inputString = "xxx ooo xxx";
        WordCounter counterInstance = new WordCounter(inputString);
        counterInstance.printMessageInfo();

        /// sample
        // get
//        System.out.println("Введите текст");
//        Scanner in = new Scanner(System.in);
//        String string = in.nextLine();
//        String[] words = string.split("\\s+");
//
//        HashMap <String, Integer> wordToCount = new HashMap<>();
//
//        for (String word : words) {
//            if (!wordToCount.containsKey(word)) {
//                wordToCount.put(word, 0);
//            }
//            wordToCount.put(word, wordToCount.get(word) + 1);
//        }
//
//        for (String word : wordToCount.keySet()) {
//            System.out.println(word + " " + wordToCount.get(word));
//        }
    }
}
