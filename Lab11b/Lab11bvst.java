// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment. 

import java.util.Random;

public class Lab11bvst
{
    public static void main(String[] args)
    { 
        Deck deck = new Deck();
        System.out.println(deck);
    }
}


class Deck 
{
    private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
    private String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    private int[] value = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    private Card[] cards;
    private int size;

    public Deck() 
    {
        size = 52;
        cards = new Card[size];
        int count = 0;
        for(String suit : suits){
            for(int i=0;i<13;i++){
                cards[count] = new Card(suit,ranks[i],value[i]);
                count++;
            }
        }
        shuffle();
    }
    public String toString(){
        String string="";
        for(Card card : cards)
            System.out.println(card);
        return string;
    }
    private void shuffle(){
        Random rand = new Random();
        int indexOne;
        int indexTwo;
        Card temp;
        for(int i=0;i<1000;i++){
            indexOne=rand.nextInt(51);
            indexTwo=rand.nextInt(51);
            temp=this.cards[indexOne];
            this.cards[indexOne]=this.cards[indexTwo];
            this.cards[indexTwo]=temp;
        }
    }
 }
