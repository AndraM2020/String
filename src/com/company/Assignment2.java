package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        String theMountainThing = "Climb mountains not so the world can see you, but so you can see the world";

        //how many words in the sentence
        String[] wordsArr = theMountainThing.replaceAll("[^a-z A-Z]", "").toLowerCase().split("\\s+");//https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
        System.out.println("There are " + wordsArr.length + " words in the sentence.");

        //how many "the" in the sentence
        int count = 0;
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].equalsIgnoreCase("the")) {
                count++;
            }
        }
        System.out.println("There are " + count + " 'the' in the sentence.");

        //how many words contain letter "C"
        int count1 = 0;
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].contains("s")) {
                count1++;
            }
        }
        System.out.println("There are " + count1 + " words containing letter 's'.");

        //words that are repeated
        System.out.print("These words are repeated in the sentence: ");
        int count2 = 0;
        for (int i = 0; i < wordsArr.length; i++) {
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
        System.out.println("");

        //changing you to You
        String youToUpperCase = theMountainThing.replaceAll("you", "You");
        System.out.println(youToUpperCase);

    }
}
