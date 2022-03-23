package com.company;

import com.company.cards.CardB;
import com.company.cards.Deck;

import java.util.ArrayList;

public class DealCards {
    public static void main(String[] args) {
        Deck deck = Deck.createDeckWithJokers();
        ArrayList<CardB> cards = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            cards.add(deck.dealCard());
        }
        deck.returnCardIntoDeck(cards.get(0));
        deck.returnCardIntoDeck(cards.get(4));
        deck.returnCardIntoDeck(cards.get(4));
        System.out.println(deck);

        deck.shuffle();
        deck.sort();
        System.out.println(deck);

        while (!deck.isEmpty()) {
            deck.dealCard();
        }
        System.out.println(deck);
    }
}
