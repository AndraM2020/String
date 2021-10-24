package com.company;

import java.util.Random;

public class Assignment4 {
    enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public static void main(String[] args) {

        String cardPack[] = new String[52];
        int i = 0;

        //creating a pack of cards
        for (Suit iSuit : Suit.values()) {
            for (Value iValue : Value.values()) {
                cardPack[i] = iValue + " of " + iSuit;
                i++;
            }
        }
        // shuffle cards (using https://www.journaldev.com/32661/shuffle-array-java)
        Random cardOrder = new Random();

        String[] array = new String[0];
        for (int k = 0; k < cardPack.length; k++) {
            int randomCardToSwap = cardOrder.nextInt(cardPack.length);
            String temp = cardPack[randomCardToSwap];
            cardPack[randomCardToSwap] = cardPack[k];
            cardPack[k] = temp;
        }
        for (String iCard : cardPack) {
            System.out.println(iCard);
        }
        System.out.println("The first card is " + cardPack[0]);

    }

}
