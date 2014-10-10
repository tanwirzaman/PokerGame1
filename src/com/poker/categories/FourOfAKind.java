/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.categories;
import com.pokergame.*;
import com.pokergame.Card.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Tanwir
 */
public class FourOfAKind extends Category{

    HashMap<Value,Integer> map=new HashMap<Value, Integer>();
    @Override
    public int checkPattern(Hand hand) {
    for(Card c:hand.getCardList())
        {            
         if(map.containsKey(c.val())){
             map.put(c.val(),map.get(c.val())+1);
         }
         else
         {
             map.put(c.val(),1);
         }
        }
        for(Card c: hand.getCardList())
        {
            if(map.get(c.val())==4)
                return Category.Type.FourOfAKind.getPoints();
        }
                 
                     
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
