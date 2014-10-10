/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokergame;

import com.poker.categories.Flush;
import com.poker.categories.FourOfAKind;
import com.poker.categories.FullHouse;
import com.poker.categories.HighCard;
import com.poker.categories.OnePair;
import com.poker.categories.Straight;
import com.poker.categories.StraightFlush;
import com.poker.categories.ThreeOfAKind;
import com.poker.categories.TwoPair;
import java.util.ArrayList;

/**
 *
 * @author Tanwir
 */
public class Evaluator {
   
    public static int getHandRank(Hand hand)
    {
        int rank=-1;
        Category c=new StraightFlush();
        if((rank=c.checkPattern(hand))!=-1)
        {
            hand.setCtegoryType(Category.Type.StraightFlush);
            return rank;
        }
        c=new FourOfAKind();
        if((rank=c.checkPattern(hand))!=-1)
        {
            hand.setCtegoryType(Category.Type.FourOfAKind);
            return rank;
        }
        c=new FullHouse();
        if((rank=c.checkPattern(hand))!=-1)
         {
            hand.setCtegoryType(Category.Type.FullHouse);
            return rank;
        }
        c=new Flush();
        if((rank=c.checkPattern(hand))!=-1)
         {
            hand.setCtegoryType(Category.Type.Flush);
            return rank;
        }
        c=new Straight();
        if((rank=c.checkPattern(hand))!=-1)
        {
            hand.setCtegoryType(Category.Type.Straight);
            return rank;
        }
        c=new ThreeOfAKind();
        if((rank=c.checkPattern(hand))!=-1)
         {
            hand.setCtegoryType(Category.Type.ThreeOfAKind);
            return rank;
        }
        c=new TwoPair();
        if((rank=c.checkPattern(hand))!=-1)
        {
            hand.setCtegoryType(Category.Type.TwoPair);
            return rank;
        }
        c=new OnePair();
        if((rank=c.checkPattern(hand))!=-1)
         {
            hand.setCtegoryType(Category.Type.OnePair);
            return rank;
        }
        else
            return 1;
        
    }
    
    public static Hand TieBreak(ArrayList<Hand> hands)
    {
         Hand highHand=hands.get(0);
         //HIGH_CARD
          if(highHand.getRank()==1)
          {
            for(int j=1;j<hands.size();j++)
            {
                HighCard high=new HighCard();
                highHand= high.getHighCard(highHand, hands.get(j));
            }
          }
         
         //STRAIGT_FLUSH
          else if(highHand.getCtegoryType()==Category.Type.StraightFlush)
         {
            for(int j=1;j<hands.size();j++)
            {
                Category cat=new StraightFlush();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
         }
          else if(highHand.getCtegoryType()==Category.Type.FourOfAKind)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new FourOfAKind();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.FullHouse)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new FullHouse();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.Flush)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new Flush();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.Straight)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new Straight();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.ThreeOfAKind)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new ThreeOfAKind();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.TwoPair)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new TwoPair();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          else if(highHand.getCtegoryType()==Category.Type.OnePair)
          {
              for(int j=1;j<hands.size();j++)
            {
                Category cat=new OnePair();
                highHand= cat.tieBreaker(highHand, hands.get(j));
            }
          }
          
          return highHand;
   }
}
