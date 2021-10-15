package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        String[] randomValues = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        startingWithC(randomValues);
        endingWithE(randomValues);
        withLenght5(randomValues);
        containingE(randomValues);
        substringTe(randomValues);
        histogram(randomValues);
    }

    public static void startingWithC(String[] randomValues) {
        int startsWithCCount = 0;
        for (int i = 0; i < randomValues.length; i++)
            if (randomValues[i].charAt(0) == 'C')
                startsWithCCount++;
        {
            System.out.println("There are " + startsWithCCount + " value(-s) starting with 'C'. ");
        }
    }

    public static void endingWithE(String[] randomValues) {
        int endsWithECount = 0;
        for (int i = 0; i < randomValues.length; i++)
            if (randomValues[i].charAt(randomValues[i].length() - 1) == 'e')
                endsWithECount++;
        {
            System.out.println("There are " + endsWithECount + " value(-s) ending with 'e'.");
        }
    }

    public static void withLenght5(String[] randomValues) {
        int valuesWithLengthOf5Count = 0;
        for (int i = 0; i < randomValues.length; i++)
            if (randomValues[i].length() == 5)
                valuesWithLengthOf5Count++;
        {
            System.out.println("There are " + valuesWithLengthOf5Count + " value(-s) with the length of 5.");
        }
    }

    public static void containingE(String[] randomValues) {
        int valuesCountainingEcount = 0;
        for (int i = 0; i < randomValues.length; i++)
            if (randomValues[i].contains("e"))
                valuesCountainingEcount++;
        {
            System.out.println("There are " + valuesCountainingEcount + " value(-s) containing letter 'e'");
        }
    }

    public static void substringTe(String[] randomValues) {
        boolean isThereSubStringTe = false;
        for (int i = 0; i < randomValues.length; i++)
            if (randomValues[i].contains("te"))
                isThereSubStringTe = true;
        if (isThereSubStringTe) {
            System.out.println("There are values containing substring 'te'.");
        } else {
            System.out.println("There are no substring 'te' found");
        }
    }

    public static void histogram(String[] randomValues) {
        int[] arrForCharacterCount = new int[12];
        for (int j = 0; j < arrForCharacterCount.length; j++) {
            int charCounter2 = 0;
            for (String word : randomValues)
                if (j == word.length())
                    charCounter2++;
            arrForCharacterCount[j] = charCounter2;
            if (charCounter2 != 0) {
                System.out.println("There are " + arrForCharacterCount[j] + " word(s) with " + j + " characters.");
            }
        }
    }

}
