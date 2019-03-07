// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;
import java.util.Random;

public class Lab12bv100
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
    private ArrayList<Card> cards;
    private int size;

    public Deck() 
    {
        size = 52;
        cards = new ArrayList<Card>();
        int count = 0;
        for(String suit : suits){
            for(int i=0;i<13;i++){
                cards.add(new Card(suit,ranks[i],value[i]));
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
    
    /*private void shuffle(){
        Random rand = new Random();
        int indexOne;
        int indexTwo;
        Card temp;
        for(int i=0;i<1000;i++){
            indexOne=rand.nextInt(51);
            indexTwo=rand.nextInt(51);
            temp=cards.get(indexOne);
            cards.set(indexOne,cards.get(indexTwo));
            cards.set(indexTwo,temp);
        }
    }*/
    private void shuffle(){
        Random rand = new Random();
        int indexOne;
        int indexTwo;
        Card temp;
        for(int i=0;i<1000;i++){
            indexOne=rand.nextInt(51);
            indexTwo=rand.nextInt(51);
            temp=cards.get(indexOne);
            cards.remove(indexOne);
            cards.add(indexTwo,temp);
        }
    }     
}
//Although it may just be due to the similarity in the ways that I have
//written both shuffle methods, they have fairly similar execution times.
//The swap shuffle, however, would seem the more efficient method to me
//as it moves around two cards for each run through the loop while using
//the same number of methods.