package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment2 {
    public static void main(String[] args) {
        String theMountainSentence = "Climb mountains not so the world can see you, but so you can see the world";
        String youToUpperCase = theMountainSentence.replaceAll("you", "You");
        System.out.println(youToUpperCase);

        wordsInSentece(theMountainSentence);
        theInSentence(theMountainSentence);
        wordsWithS(theMountainSentence);
        repeatedWords(theMountainSentence);
    }

    public static void wordsInSentece(String theMountainSentence) {
        String[] wordsArr = theMountainSentence.replaceAll("[^a-z A-Z]", "").toLowerCase().split("\\s+");//https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
        System.out.println("There are " + wordsArr.length + " words in the sentence.");
    }

    public static void theInSentence(String theMountainSentence) {
        String[] wordsArr = theMountainSentence.split("\\s+");
        int count = 0;
        for (
                int i = 0;
                i < wordsArr.length; i++) {
            if (wordsArr[i].equalsIgnoreCase("the")) {
                count++;
            }
        }
        System.out.println("There are " + count + " 'the' in the sentence.");
    }

    public static void wordsWithS(String theMountainSentence) {
        String[] wordsArr = theMountainSentence.split("\\s+");
        int count1 = 0;
        for (
                int i = 0;
                i < wordsArr.length; i++) {
            if (wordsArr[i].contains("s")) {
                count1++;
            }
        }
        System.out.println("There are " + count1 + " words containing letter 's'.");
    }


    public static void repeatedWords(String theMountainSentence) {
        /*
        String[] wordsArr = theMountainSentence.split("\\s+");
        System.out.print("These words are repeated in the sentence: ");
        int count2 = 0;
        for (
                int i = 0;
                i < wordsArr.length; i++) {
            count2 = 1;
            for (int j = i + 1; j < wordsArr.length; j++) {
                if (wordsArr[i].equalsIgnoreCase(wordsArr[j])) {
                    count2++;
                    wordsArr[j] = "0";
                }
            }
            if (count2 > 1 && wordsArr[i] != "0") {
                System.out.print(wordsArr[i] + "; ");
            }
        }
        System.out.println("");*/

        System.out.print("These words are repeated in the sentence: \n");
        Pattern p = Pattern.compile("\\b(\\w+)\\b(?=.*\\b(\\1)\\b)", Pattern.DOTALL); // matches duplicates only in a single line
        Matcher m = p.matcher(theMountainSentence);
        while (m.find()) {
            System.out.println("at: " + m.start(1) + " " + m.group(1));
            System.out.println("    " + m.start(2) + " " + m.group(2));
        }
    }
}

