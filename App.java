import java.util.*;
import java.util.Scanner;

public class App{

    
    public static void gameLoop(String mode, int deckAmount, String shufleMode, String helpMode, int funds){
        ArrayList<String> players;

        System.out.println("Initializing deck");
        Stack<String> deck = new Stack<>();
        deck.clone(Util.packCards(Util.deckShuffle(Util.deckBuilder(deckAmount))));
        
        System.out.println("Amount of players");
        Scanner input = new Scanner();
        int playerAmount = input.nextLine();
        input.close();

        for (int i = 0; i < playerAmount; i++){
            Player user = new Player(i, funds);
        }

        
    }
    



    public static boolean isOver(){
        for (String user : players){
            if (!(user.Player.getFunds() == 0)){
                return false;
            }
        }
        return true;
    }
        
    
}