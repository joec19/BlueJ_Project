// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment. 


public class Lab11bst
{
	public static void main(String[] args)
	{ 
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck 
{
	private Card[] cards;
	private int size;

	public Deck() 
   {
      size = 52;
		cards = new Card[size];
	}    
 }
