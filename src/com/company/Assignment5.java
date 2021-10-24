package com.company;

public class Assignment5 {
    public static void main(String[] args) {
        String sentenceToCheck = "Yo, banana boy!";
        sentenceToCheck = sentenceToCheck.replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.println(sentenceToCheck);

        boolean isPalindrome = true;
        int i = 0;
        int k = sentenceToCheck.length() - 1;

        while (i < k)
            if (sentenceToCheck.charAt(i) != sentenceToCheck.charAt(k)) {
                isPalindrome = false;

                System.out.println("The sentence is not a palindrome");
                break;
            } else {
                i++;
                k--;
            }
        if (isPalindrome) {
            System.out.println("The sentence is a palindrome");
        }
    }
}
