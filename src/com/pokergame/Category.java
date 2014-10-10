/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokergame;

import java.util.ArrayList;

/**
 *
 * @author Tanwir
 */
public abstract class Category {
    public enum Type { StraightFlush(9), FourOfAKind(8),FullHouse(7),Flush(6),Straight(5),ThreeOfAKind(4),TwoPair(3),OnePair(2),HighCard(1);
    private int points;
    Type(int points)
    {
        this.points=points;
    }
    public int getPoints()
    {
        return this.points;
    }
   }
    public abstract int checkPattern(Hand hand);
    public abstract Hand tieBreaker(Hand a,Hand b);
            
}
