import java.util.*;
public class CardTester {

   /**
    * The main method in this class checks the Card operations for consistency.
    *	@param args is not used.
    */
   public static void main(String[] args) {
      Card card1 = new Card("Ace", "Spades", 1);
      Card card2 = new Card("Ten", "Hearts", 10);
      Card card3 = new Card("Ace", "Spades", 1);
      
System.out.println(card1.rank()+card1.suit()+card1.pointValue());
      System.out.println(card1.toString());
      System.out.println(card2.rank()+card2.suit()+card2.pointValue());
      System.out.println(card2.toString());
      System.out.println(card3.rank()+card3.suit()+card3.pointValue());
      System.out.println(card3.toString());

      System.out.println("----------------------------");
      System.out.println(card1.matches(card2));
      System.out.println(card1.matches(card3));
   }
}