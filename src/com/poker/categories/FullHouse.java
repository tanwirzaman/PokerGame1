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
public class FullHouse extends Category{

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
     if(map.keySet().size()==2)
     {      
        if(map.containsValue(3) && map.containsValue(2))
            return Category.Type.FullHouse.getPoints();       
     }                   
                     
        return -1;         
        
    }

    @Override
    public Hand tieBreaker(Hand a, Hand b) {
         HashMap<Value,Integer> map_a=new HashMap<Value, Integer>();
         HashMap<Value,Integer> map_b=new HashMap<Value, Integer>();
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
        Value a_triplet_Val = Card.Value.TWO;
        Value b_triplet_Val = Card.Value.TWO;
        for(Value v:map_a.keySet())
        {
            if(map_a.get(v)==3)
                a_triplet_Val=v;
        }
        for(Value v:map_b.keySet())
        {
            if(map_b.get(v)==3)
                b_triplet_Val=v;
        }
        if(a_triplet_Val.compareTo(b_triplet_Val)>0)
            return a;
        else if(a_triplet_Val.compareTo(b_triplet_Val)<0)
            return b;
        else
        {
            map_a.remove(a_triplet_Val);
            map_b.remove(b_triplet_Val);
            for(Value v_a: map_a.keySet())
                for(Value v_b: map_b.keySet() )
                {
                    if(v_a.compareTo(v_b)>0)
                        return a;
                    else
                        return b;
                                
                }
         }
       
        return null;
    }
    
}
