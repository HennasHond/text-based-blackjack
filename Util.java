import java.util.random.*;
import java.util.*;


public class Util {

    static String[] CARDSUITS = {"Hearts", "Diamonds", "Spades", "Clovers"};
    static String[] CARDRANKS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
                                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public static final HashMap<String, Integer> CARD_VALUES = new HashMap<>();
    static {
        CARD_VALUES.put("Two", 2);
        CARD_VALUES.put("Three", 3);
        CARD_VALUES.put("Four", 4);
        CARD_VALUES.put("Five", 5);
        CARD_VALUES.put("Six", 6);
        CARD_VALUES.put("Seven", 7);
        CARD_VALUES.put("Eight", 8);
        CARD_VALUES.put("Nine", 9);
        CARD_VALUES.put("Ten", 10);
        CARD_VALUES.put("Jack", 10);
        CARD_VALUES.put("Queen", 10);
        CARD_VALUES.put("King", 10);
        CARD_VALUES.put("Ace", 11);
    }

    public static ArrayList<String> deckBuilder(int deckAmount) {
        ArrayList<String> completeDeck = new ArrayList<>();
    
        for (int i = 0; i < deckAmount; i++) {
            for (int j = 0; j < CARDSUITS.length; j++) {    
                for (int k = 0; k < CARDRANKS.length; k++) {
                    completeDeck.add(CARDRANKS[k] + "_of_" + CARDSUITS[j]);  
                }
            }
        }
        return completeDeck;
    }

    public static ArrayList<String> deckShuffle(ArrayList<String> currentDeck) {
        Random rand = new Random();

        for (int i = 0; i < currentDeck.size(); i++) {
            
            int j = rand.nextInt(currentDeck.size());  
            String temp = currentDeck.get(i);
            
            currentDeck.set(i, currentDeck.get(j));
            currentDeck.set(j, temp);
        }

    return currentDeck;
    }

    public static Stack<String> packCards(ArrayList<String> currentDeck) {
        Stack<String> deck = new Stack<>();

        for (String card : currentDeck){
            deck.push(card);
        }
        return deck;
    }

    public static int returnCardValue(String card){
        return CARD_VALUES.get(card.substring(0, card.indexOf("_")));
    }
    
    public static int returnDeckValue(ArrayList<String> currentDeck) {
        int total = 0;
        for (String card:currentDeck){
            total+=returnCardValue(card);
        }
        return total;
    }

    public static int returnAmountOfAces(ArrayList<String> currentDeck){
        int total = 0;
        for (String card:currentDeck){
            if (card.substring(0, card.indexOf("_")).equals("Ace")){
                total += 1;
            }
        }
        return total;
    }

    public static int acePostSwitchValue(ArrayList<String> currentDeck){
        for (int i = 0; i < returnAmountOfAces(currentDeck); i++){  
            int deductedDeckValue = returnDeckValue(currentDeck) - 10*i;
            if (deductedDeckValue < 21){
                return deductedDeckValue;
            }
        }
        return -1;
    }
}
