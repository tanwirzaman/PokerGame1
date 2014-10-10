/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokergame;

/**
 *
 * @author Tanwir
 */
public class Card implements Comparable<Card>{
    public enum Value { TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),JACK(11),
    QUEEN(12), KING(13), ACE(14);
    private int points;
    Value(int points)
    {
        this.points=points;
    }
    public int getVal()
    {
        return this.points;
    }
   }
    
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    private final Value val;
    private final Suit suit;
    
    public Card(Value val, Suit suit) {
        if (val == null || suit == null)
            throw new NullPointerException(val + ", " + suit);
        this.val = val;
        this.suit = suit;
    }
        
    public Value val() { return val; }
    public Suit suit() { return suit; }     
    
     public int compareTo(Card c) {
        return -(val.compareTo(c.val));
    }
}
