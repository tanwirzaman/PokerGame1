/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokergame;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tanwir
 */
public class Hand {
    private ArrayList<Card> cardList=new ArrayList<Card>();
    private Category.Type categoryType;
    private int Rank;
    
    public Hand(ArrayList<Card> list) 
    {
        if(list==null||list.size()<=0)
             throw new NullPointerException("List is empty");
        for(Card c:list)
        {
            for(Card cd:list)
            {
                if(c!=cd && c.suit()==cd.suit() && c.val()==cd.val())
                    throw new IllegalArgumentException("Cards cannot be repeated.");
            }
        }
        this.cardList=list;
        Collections.sort(cardList);
    }
    public ArrayList<Card> getCardList()
    {
        return this.cardList;
    }
    
    public int getRank()
    {
        this.Rank= Evaluator.getHandRank(this);
        return Rank;           
    }
    
    public Category.Type getCtegoryType()
    {
        return this.categoryType;
    }
    public void setCtegoryType(Category.Type c)
    {
        this.categoryType=c;
    }
    
}
