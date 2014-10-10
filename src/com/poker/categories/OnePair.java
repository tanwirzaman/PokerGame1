/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.categories;

import com.pokergame.Card;
import com.pokergame.Category;
import com.pokergame.Hand;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tanwir
 */
public class OnePair extends Category{
    HashMap<Card.Value,Integer> map=new HashMap<Card.Value, Integer>();
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
            if(map.get(c.val())==2)
                return Category.Type.OnePair.getPoints();
        }
                 
                     
        return -1;  
    }

    @Override
    public Hand tieBreaker(Hand a,Hand b) {
        HashMap<Card.Value,Integer> map_a=new HashMap<Card.Value, Integer>();
         HashMap<Card.Value,Integer> map_b=new HashMap<Card.Value, Integer>();
        for(Card c:a.getCardList())
        {            
         if(map_a.containsKey(c.val())){
             map_a.put(c.val(),map_a.get(c.val())+1);
         }
         else
         {
             map_a.put(c.val(),1);
         }
        }
        for(Card c:b.getCardList())
        {            
         if(map_b.containsKey(c.val())){
             map_b.put(c.val(),map_b.get(c.val())+1);
         }
         else
         {
             map_b.put(c.val(),1);
         }
        }
        Card.Value a_pair_Val = Card.Value.TWO;
        Card.Value b_pair_Val = Card.Value.TWO;
        for(Card.Value v:map_a.keySet())
        {
            if(map_a.get(v)==2)
                a_pair_Val=v;
        }
        for(Card.Value v:map_b.keySet())
        {
            if(map_b.get(v)==2)
                b_pair_Val=v;
        }
        if(a_pair_Val.compareTo(b_pair_Val)>0)
            return a;
        else if(a_pair_Val.compareTo(b_pair_Val)<0)
            return b;
        else
        {
            ArrayList<Card> lista=(ArrayList<Card>)a.getCardList().clone();
            ArrayList<Card> listb=(ArrayList<Card>)b.getCardList().clone();
            for(Card c:a.getCardList())
              {
                  if(c.val()==a_pair_Val)
                      lista.remove(c);
              }
              for(Card c:b.getCardList())
              {
                  if(c.val()==b_pair_Val)
                      listb.remove(c);
              }
            Card.Value higha = Card.Value.TWO;
            Card.Value highb =Card.Value.TWO;
            for(int i=0;i<lista.size()-1;i++)
            {
                if(lista.get(i).val().compareTo(lista.get(i+1).val())>0)
                    higha=lista.get(i).val();
            }
            for(int i=0;i<listb.size()-1;i++)
            {
                if(listb.get(i).val().compareTo(listb.get(i+1).val())>0)
                    highb=listb.get(i).val();
            }
            if(higha.compareTo(highb)>0)
                return a;
            else
                return b;
        }
    }
    
}
