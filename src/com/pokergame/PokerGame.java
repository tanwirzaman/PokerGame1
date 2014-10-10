/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokergame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tanwir
 */
public class PokerGame {

    public static void test_Null()
    {
        //Null
        boolean testPassed=false;
        try{
        Card c1=new Card(null, null);
        }
        catch(NullPointerException e)
        {
          testPassed=true;
        }
        try{
          Hand hand1=new Hand(null);
        }
        catch(NullPointerException e)
        {
            testPassed=true;
        }
        catch(IllegalArgumentException ex)
        {
            testPassed=true;
        }
        if(testPassed)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
  }
    
    public static void test_Repeated_Cards()
    {
        boolean testPassed=false;
        //Repeated cards
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        try{
        Hand FullHouse=new Hand(list1);
        }
        catch(IllegalArgumentException e)
        {
            testPassed=true;
        }
        if(testPassed)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
    }
         
    public static void test_FullHouse_Straight(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //straight
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.EIGHT, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand straight=new Hand(list2);
        
        if((FullHouse.getRank()> straight.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    
    public static void test_FullHouse_ThreeOfAKind(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //threeofakind
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind=new Hand(list2);
        
        if((FullHouse.getRank()> threeofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    public static void test_FullHouse_TwoPair(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //twopair
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((FullHouse.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    public static void test_FullHouse_OnePair(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //onepair
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FOUR, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((FullHouse.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    public static void test_FullHouse_HighCard(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //highcard
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.KING, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((FullHouse.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    public static void test_FullHouse_Flush(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse=new Hand(list1);
        
        //Flush
        Card c6=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c7=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.FOUR, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.SIX, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand flush=new Hand(list2);
        
        if((FullHouse.getRank()> flush.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   }
    
    public static void test_FullHouse_Fullhouse(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse1=new Hand(list1);
        
        //FullHouse
        Card c6=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);        
        Hand FullHouse2=new Hand(list2);
        
        if((FullHouse1.getRank()== FullHouse2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(FullHouse1);
            list.add(FullHouse2);
            Hand result=Evaluator.TieBreak(list);
            if(result == FullHouse1)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
   }
    
    public static void test_StFlush_FourofaKind()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //FourofaKind
        Card c6=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.SIX, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.ACE, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand fourofakind=new Hand(list2);
        
        if((st_flush.getRank()> fourofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_FullHouse()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //FullHouse
        Card c6=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.SIX, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.ACE, Card.Suit.CLUBS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand fullhouse=new Hand(list2);
        
        if((st_flush.getRank()> fullhouse.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_Flush()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //Flush
        Card c6=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand flush=new Hand(list2);
        
        if((st_flush.getRank()> flush.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_Straight()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //Straight
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.FIVE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand straight=new Hand(list2);
        
        if((st_flush.getRank()> straight.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_ThreeOfAKind()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //ThreeofAKind
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.FIVE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind=new Hand(list2);
        
        if((st_flush.getRank()> threeofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_TwoPair()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //TwoPair
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.EIGHT, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.FIVE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((st_flush.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_OnePair()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //OnePair
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.ACE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.KING, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((st_flush.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_StFlush_HighCard()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush=new Hand(list1);
        
        
        //HighCard
        Card c6=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.ACE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.KING, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((st_flush.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
     public static void test_stFlush_stFlush()
    {
        //StraightFlush
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand st_flush1=new Hand(list1);
        
        
        //starightFlush(Royal Flush)
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand st_flush2=new Hand(list2);
        
        if((st_flush1.getRank()== st_flush2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(st_flush1);
            list.add(st_flush2);
            Hand result=Evaluator.TieBreak(list);
            if(result == st_flush2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
      public static void test_ThreeofaKind_Twopair()
    {
        //ThreeofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand threeOfaKind=new Hand(list1);
        
        
        //TwoPair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.ACE, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((threeOfaKind.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_ThreeofaKind_OnePair()
    {
        //ThreeofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand threeOfaKind=new Hand(list1);
        
        
        //OnePair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.ACE, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((threeOfaKind.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_ThreeofaKind_HighCard()
    {
        //ThreeofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand threeOfaKind=new Hand(list1);
        
        
        //HighCard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.JACK, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.FIVE, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((threeOfaKind.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_TwoPair_TwoPair()
    {
        //Twopair
        Card c1=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand twopair1=new Hand(list1);
        
        
        //Twopair
        Card c6=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.TEN, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.THREE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair2=new Hand(list2);
        
        if((twopair1.getRank()== twopair2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(twopair1);
            list.add(twopair2);
            Hand result=Evaluator.TieBreak(list);
            if(result == twopair1)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
       public static void test_OnePair_HighCard()
    {
        //OnePair
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.FOUR, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand onepair=new Hand(list1);
        
        
        //HighCard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((onepair.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_highCard_highCard()
    {
        //highcard
        Card c1=new Card(Card.Value.QUEEN, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.HEARTS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand highcard1=new Hand(list1);
        
        
        //highcard
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.THREE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard2=new Hand(list2);
        
        if((highcard1.getRank()== highcard1.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(highcard1);
            list.add(highcard2);
            Hand result=Evaluator.TieBreak(list);
            if(result == highcard2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
  
    public static void test_FourofaKind_HighCard()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //HighCard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((fourofakind.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_FourofaKind_FullHouse()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //FullHouse
        Card c6=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.EIGHT, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand fullhouse=new Hand(list2);
        
        if((fourofakind.getRank()> fullhouse.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_FourofaKind_Flush()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //Flush
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.EIGHT, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.FOUR, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand flush=new Hand(list2);
        
        if((fourofakind.getRank()> flush.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_FourofaKind_Straight()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //Staright
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand straight=new Hand(list2);
        
        if((fourofakind.getRank()> straight.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_FourofaKind_ThreeOfAKind()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //ThreeofaKind
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind=new Hand(list2);
        
        if((fourofakind.getRank()> threeofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_FourofaKind_TwoPair()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //Twopair
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.KING, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((fourofakind.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    
    public static void test_FourofaKind_OnePair()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.THREE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.THREE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.THREE, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind=new Hand(list1);
        
        
        //Onepair
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card c8=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c9=new Card(Card.Value.JACK, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((fourofakind.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
     public static void test_FourofaKind_FourofaKind()
    {
        //FourofaKind
        Card c1=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.KING, Card.Suit.HEARTS);
        Card c4=new Card(Card.Value.KING, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand fourofakind1=new Hand(list1);
        
        
        //Fourofakind
        Card c6=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.QUEEN, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.QUEEN, Card.Suit.HEARTS);
        Card c9=new Card(Card.Value.QUEEN, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand fourofakind2=new Hand(list2);
        
        if((fourofakind1.getRank()== fourofakind2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(fourofakind1);
            list.add(fourofakind2);
            Hand result=Evaluator.TieBreak(list);
            if(result == fourofakind1)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
    public static void test_Flush_Straight()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush=new Hand(list1);
        
        
        //straight
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.JACK, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand straight=new Hand(list2);
        
        if((flush.getRank()> straight.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_Flush_ThreeofaKind()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush=new Hand(list1);
        
        
        //threeofakind
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.KING, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind=new Hand(list2);
        
        if((flush.getRank()> threeofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_Flush_TwoPair()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush=new Hand(list1);
        
        
        //twopair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((flush.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_Flush_OnePair()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush=new Hand(list1);
        
        
        //onepair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FOUR, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((flush.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_Flush_HighCard()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.SIX, Card.Suit.CLUBS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush=new Hand(list1);
        
        
        //highcard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.SEVEN, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highCard=new Hand(list2);
        
        if((flush.getRank()> highCard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_straight_HighCard()
    {
        //Straight
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand straight=new Hand(list1);
        
        
        //HighCard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.SIX, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((straight.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_straight_ThreeOfAKind()
    {
        //Straight
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand straight=new Hand(list1);
        
        
        //threeofakind
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.KING, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind=new Hand(list2);
        
        if((straight.getRank()> threeofakind.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_straight_TwoPair()
    {
        //Straight
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand straight=new Hand(list1);
        
        
        //twopair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair=new Hand(list2);
        
        if((straight.getRank()> twopair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_straight_OnePair()
    {
        //Straight
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SIX, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand straight=new Hand(list1);
        
        
        //onepair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((straight.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_Straight_Straight()
    {
        //straight
        Card c1=new Card(Card.Value.JACK, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.HEARTS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand straight1=new Hand(list1);
        
        
        //straight
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.JACK, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand straight2=new Hand(list2);
        
        if((straight1.getRank()== straight2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(straight1);
            list.add(straight2);
            Hand result=Evaluator.TieBreak(list);
            if(result == straight2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
    public static void test_Flush_Flush()
    {
        //Flush
        Card c1=new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card c2=new Card(Card.Value.QUEEN, Card.Suit.HEARTS);
        Card c3=new Card(Card.Value.TEN, Card.Suit.HEARTS);
        Card c4=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.THREE, Card.Suit.HEARTS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand flush1=new Hand(list1);
        
        
        //Flush
        Card c6=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.JACK, Card.Suit.SPADES);
        Card c10=new Card(Card.Value.SIX, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand flush2=new Hand(list2);
        
        if((flush1.getRank()== flush2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(flush1);
            list.add(flush2);
            Hand result=Evaluator.TieBreak(list);
            if(result == flush1)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
    public static void test_TwoPair_OnePair()
    {
        //TwoPair
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SEVEN, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand twopair=new Hand(list1);
        
        
        //OnePair
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.TEN, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair=new Hand(list2);
        
        if((twopair.getRank()> onepair.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
    public static void test_TwoPair_HighCard()
    {
        //TwoPair
        Card c1=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c3=new Card(Card.Value.SEVEN, Card.Suit.SPADES);
        Card c4=new Card(Card.Value.SEVEN, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.FIVE, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand twopair=new Hand(list1);
        
        
        //highcard
        Card c6=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.TEN, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.JACK, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c10=new Card(Card.Value.TWO, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand highcard=new Hand(list2);
        
        if((twopair.getRank()> highcard.getRank())==true)
            System.out.println("Test Passed");
        else
            System.err.println("Test Failed");
   
  }
     public static void test2_TwoPair_TwoPair()
    {
        //Twopair
        Card c1=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand twopair1=new Hand(list1);
        
        
        //Twopair
        Card c6=new Card(Card.Value.KING, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand twopair2=new Hand(list2);
        
        if((twopair1.getRank()== twopair2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(twopair1);
            list.add(twopair2);
            Hand result=Evaluator.TieBreak(list);
            if(result == twopair2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
     public static void test_Threeofakind_Threeofakind()
    {
        //Threeofakind
        Card c1=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.EIGHT, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c4=new Card(Card.Value.ACE, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand threeofakind1=new Hand(list1);
        
        
        //threeofakind
        Card c6=new Card(Card.Value.EIGHT, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.EIGHT, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand threeofakind2=new Hand(list2);
        
        if((threeofakind1.getRank()== threeofakind2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(threeofakind1);
            list.add(threeofakind2);
            Hand result=Evaluator.TieBreak(list);
            if(result == threeofakind1)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
     
    public static void test_OnePair_Onepair()
    {
        //One pair
        Card c1=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.QUEEN, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.NINE, Card.Suit.CLUBS);
        Card c4=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c5=new Card(Card.Value.SEVEN, Card.Suit.CLUBS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand onepair1=new Hand(list1);
        
        
        //OnePair
        Card c6=new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card c7=new Card(Card.Value.KING, Card.Suit.CLUBS);
        Card c8=new Card(Card.Value.NINE, Card.Suit.SPADES);
        Card c9=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.TEN, Card.Suit.SPADES);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);
        Hand onepair2=new Hand(list2);
        
        if((onepair1.getRank()== onepair2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(onepair1);
            list.add(onepair2);
            Hand result=Evaluator.TieBreak(list);
            if(result == onepair2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
  }
    
     public static void test2_FullHouse_FullHouse(){
        //FullHouse
        Card c1=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c2=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c3=new Card(Card.Value.FIVE, Card.Suit.HEARTS);
        Card c4=new Card(Card.Value.EIGHT, Card.Suit.HEARTS);
        Card c5=new Card(Card.Value.EIGHT, Card.Suit.DIAMONDS);      
        ArrayList<Card> list1=new ArrayList<Card>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);        
        Hand FullHouse1=new Hand(list1);
        
        //FullHouse
        Card c6=new Card(Card.Value.FIVE, Card.Suit.CLUBS);
        Card c7=new Card(Card.Value.FIVE, Card.Suit.SPADES);
        Card c8=new Card(Card.Value.FIVE, Card.Suit.DIAMONDS);
        Card c9=new Card(Card.Value.NINE, Card.Suit.DIAMONDS);
        Card c10=new Card(Card.Value.NINE, Card.Suit.HEARTS);      
        ArrayList<Card> list2=new ArrayList<Card>();
        list2.add(c6);
        list2.add(c7);
        list2.add(c8);
        list2.add(c9);
        list2.add(c10);        
        Hand FullHouse2=new Hand(list2);
        
        if((FullHouse1.getRank()== FullHouse2.getRank()))
        {
            ArrayList<Hand> list=new ArrayList<Hand>();
            list.add(FullHouse1);
            list.add(FullHouse2);
            Hand result=Evaluator.TieBreak(list);
            if(result == FullHouse2)   
                System.out.println("Test Passed");
            else
                System.err.println("Test Failed");
        }
        else
            System.err.println("Test Failed");
   }
    public static void main(String[] args) {
      
        //Unit Tests
        test_Null();
        test_Repeated_Cards();

        test_StFlush_FourofaKind();        
        test_StFlush_FullHouse();
        test_StFlush_Flush();
        test_StFlush_Straight();
        test_StFlush_ThreeOfAKind();
        test_StFlush_TwoPair();
        test_StFlush_OnePair();
        test_StFlush_HighCard();
        test_stFlush_stFlush();
        
        test_FullHouse_Flush();
        test_FullHouse_Straight();
        test_FullHouse_ThreeOfAKind();
        test_FullHouse_TwoPair();
        test_FullHouse_OnePair();
        test_FullHouse_HighCard();
        test_FullHouse_Fullhouse();
        test2_FullHouse_FullHouse();
                
        test_FourofaKind_FullHouse();
        test_FourofaKind_Flush();
        test_FourofaKind_Straight();
        test_FourofaKind_ThreeOfAKind();
        test_FourofaKind_TwoPair();
        test_FourofaKind_OnePair();
        test_FourofaKind_HighCard();
        test_FourofaKind_FourofaKind();
                
                
        test_straight_ThreeOfAKind();
        test_straight_TwoPair();
        test_straight_OnePair();
        test_straight_HighCard();
        test_Straight_Straight();
        
        test_Flush_Straight();
        test_Flush_ThreeofaKind();
        test_Flush_TwoPair();
        test_Flush_OnePair();
        test_Flush_HighCard();
        test_Flush_Flush();
        
        test_ThreeofaKind_Twopair();
        test_ThreeofaKind_OnePair();
        test_ThreeofaKind_HighCard();
        test_Threeofakind_Threeofakind();
                
        test_TwoPair_TwoPair();
        test_TwoPair_OnePair();
        test_TwoPair_HighCard();
        test2_TwoPair_TwoPair();
        
        test_OnePair_HighCard();
        test_OnePair_Onepair();
        
        test_highCard_highCard();
    }
}
