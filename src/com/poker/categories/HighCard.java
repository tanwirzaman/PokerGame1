/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.categories;

import com.pokergame.Card;
import com.pokergame.Hand;

/**
 *
 * @author Tanwir
 */
public class HighCard {
    
    public Hand getHighCard(Hand a,Hand b)
    {
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
