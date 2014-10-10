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
public class Straight extends Category {

    @Override
    public int checkPattern(Hand hand) {
        boolean ordered=true;
            for(int i=0;i<hand.getCardList().size()-1;i++)
            {
                int val=hand.getCardList().get(i).val().getVal();
                int next_val=hand.getCardList().get(i+1).val().getVal();
                if(val!=(next_val)+1)
                {
                    ordered=false;
                    break;
                }                
            }
            if(ordered)
                return Category.Type.Straight.getPoints();
        
            return -1;
    }

    @Override
    public Hand tieBreaker(Hand a,Hand b) {
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
