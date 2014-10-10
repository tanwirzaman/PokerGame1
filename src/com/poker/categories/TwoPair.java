/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.categories;

import com.pokergame.Card;
import com.pokergame.Card.Value;
import com.pokergame.Category;
import com.pokergame.Hand;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Tanwir
 */
public class TwoPair extends Category{
    HashMap<Card.Value,Integer> map=new HashMap<Card.Value, Integer>();
    @Override
    public int checkPattern(Hand hand) {
        int pairCount=0;
       for(int i=0;i<hand.getCardList().size()-1;i++)
       {
           if(hand.getCardList().get(i).val().compareTo(hand.getCardList().get(i+1).val())==0)
           {
               pairCount++;
           }
       }
       if(pairCount==2)
           return Category.Type.TwoPair.getPoints();
       else
           return -1;
    }

    @Override
    public Hand tieBreaker(Hand a,Hand b) {
       Value a_highPair=Card.Value.TWO;
       Value a_lowPair=Card.Value.TWO;;
       Value b_highPair=Card.Value.TWO;;
       Value b_lowPair=Card.Value.TWO;
       
       for(int i=0;i<a.getCardList().size()-1;i++)
       {
           if(a.getCardList().get(i).val().compareTo(a.getCardList().get(i+1).val())==0)
           {
               a_lowPair=a.getCardList().get(i).val();               
               if(a_highPair.compareTo(a.getCardList().get(i).val())<0)
               {
                   a_highPair=a.getCardList().get(i).val();
               }
           }
           
       }
       for(int i=0;i<b.getCardList().size()-1;i++)
       {
           if(b.getCardList().get(i).val().compareTo(b.getCardList().get(i+1).val())==0)
           {
               b_lowPair=b.getCardList().get(i).val();               
               if(b_highPair.compareTo(b.getCardList().get(i).val())<0)
               {
                   b_highPair=b.getCardList().get(i).val();
               }
           }
           
       }
       if(a_highPair.compareTo(b_highPair)>0){
           return a;
       }
       else if(a_highPair.compareTo(b_highPair)<0)
           return b;
       else
       {
          if(a_lowPair.compareTo(b_lowPair)>0)
            return a;          
          else if(a_lowPair.compareTo(b_lowPair)<0)
            return b;
          else
          {
              ArrayList<Card> alist=(ArrayList<Card>)a.getCardList().clone();
              ArrayList<Card> blist=(ArrayList<Card>)b.getCardList().clone();
              for(Card c:a.getCardList())
              {
                  if(c.val()==a_highPair || c.val()==a_lowPair)
                      alist.remove(c);
              }
              for(Card c:b.getCardList())
              {
                  if(c.val()==b_highPair || c.val()==b_lowPair)
                      blist.remove(c);
              }
              if(alist.get(0).val().compareTo(blist.get(0).val())>0)
              {
                  return a;
              }
              else
                  return b;
          }
         
       }
       
    }
       
}
