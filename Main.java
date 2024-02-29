public class Main {

   /**
    * The main method in this class checks the Deck operations for consistency.
    *	@param args is not used.
    */
   public static void main(String[] args) {
      String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
           String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
           int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

           // Create three Deck objects
           Deck deck1 = new Deck(ranks, suits, values);
           Deck deck2 = new Deck(ranks, suits, values);
           Deck deck3 = new Deck(ranks, suits, values);

           
           System.out.println("Deck 1:");
           testDeck(deck1);

           System.out.println("Deck 2:");
           testDeck(deck2);

           System.out.println("Deck 3:");
           testDeck(deck3);
       }

       public static void testDeck(Deck deck) {
           System.out.println("Initial Deck:");
           System.out.println(deck);


           
           int numCardsToDeal = 5;
           System.out.println("Dealing " + numCardsToDeal + " cards:");
           for (int i = 0; i < numCardsToDeal; i++) {
               Card dealtCard = deck.deal();
               if (dealtCard != null) {
                   System.out.println("Dealt: " + dealtCard);
               } else {
                   System.out.println("No more cards to deal.");
                   break;
               }
           }

           
           System.out.println("Is the deck empty? " + deck.isEmpty());

           
           System.out.println("Current Deck:");
           System.out.println(deck);
   }
}