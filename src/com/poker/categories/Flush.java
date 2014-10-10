/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.categories;

import com.pokergame.Card;
import com.pokergame.Category;
import com.pokergame.Hand;
import java.util.ArrayList;

/**
 *
 * @author Tanwir
 */
public class Flush extends Category
{

    @Override
    public int checkPattern(Hand hand) {
        boolean sameSuit=false;
        Card.Suit s=hand.getCardList().get(0).suit();
        for(Card c:hand.getCardList())
        {
            if(c.suit()==s)
                sameSuit=true;
            else
                {
                    sameSuit=false;
                    break;
                }
        }
        if(sameSuit)
            return Category.Type.Flush.getPoints();
        
        return -1;
    }

    @Override
    public Hand tieBreaker(Hand a, Hand b) {
        int i=0;
        if(a.getCardList().size()!=b.getCardList().size())
            return null;
        while(i<a.getCardList().size())
        {
           Card first=a.getCardList().get(i);
           Card second=b.getCardList().get(i);
           if(first.val().compareTo(second.val())>0)
               return a;
           else if(first.val().compareTo(second.val())<0)
               return b;
           else
               i++;
        }
        return a;
    }

    
    
}
