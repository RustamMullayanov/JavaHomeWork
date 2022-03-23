package com.company;

import com.company.cards.CardB;
import com.company.cards.CardC;
import com.company.cards.enums.Suit;

public class TestCardC {
    public static void main(String[] args) {
        CardC firstCard = new CardC(2, Suit.diamonds);
        CardC secondCard = new CardC(Suit.diamonds);
        CardC thirdCard = new CardC(5, Suit.clubs);
        CardC fourthCard = new CardC(Suit.spades);
        printRankCards(firstCard, secondCard, thirdCard, fourthCard);
    }

    public static void printRankCards(CardC ... cards){
        for (CardC card : cards){
            System.out.println("Card Rank= " + card.getRank());
        }
    }
}
