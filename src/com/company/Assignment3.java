package com.company;

public class Assignment3 {
    public static void main(String[] args) {
        johnString();
        usernameString();
        personalCodeString();

    }

    public static void johnString() {
        String name = "John";
        String namePattern = "[a-zA-Z]+";

        if (name.matches(namePattern)) {
            System.out.println("All correct!");
        } else {
            System.out.println("Something is not working!");
        }
    }

    public static void usernameString() {

        String username = "s20surname";
        String usernamePatter = "[a-z]{1}[0-9]{2}[a-z]+";

        if (username.matches(usernamePatter)) {
            System.out.println("You are doing good!");
        } else {
            System.out.println("Need to read more on regex!");
        }
    }

    public static void personalCodeString() {
        String personCodeOfLatvia = "121200-11311";
        String personCodeofLatviaPattern = "[0-9]{6}-[0-9]{5}";

        if (personCodeOfLatvia.matches(personCodeofLatviaPattern)) {
            System.out.println("All is good!");
        } else {
            System.out.println("Need to read more on regex!");
        }
    }

}

