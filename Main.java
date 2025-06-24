import java.util.*;

public class Main {

    static String[] STARTING_MODE = {"Test", "Text", "GUI"};
    static String[] SHUFFLING_MODE = {"Continious", "Static"};
    static String[] HELP_MODE = {"0","1"};

        public static void main(String[] args){
            
            String mode = args[0];
            int cardAmount = Integer.parseInt(args[1]);
            String shuflMode = args[2];
            String helpMode = args[3];
            int funds = Integer.parseInt(args[4]);
            boolean toExit = false;

            if (!Arrays.asList(STARTING_MODE).contains(mode)){
                System.err.println("ERROR: Wrong mode recieved '" + mode + "'");
                toExit = true;
            }

            if (cardAmount < 64 || cardAmount > 6400){
                System.err.println("ERROR: Wrong cardAmmount recieved '" + cardAmount + "'");
                toExit = true;
            }

            if(!Arrays.asList(SHUFFLING_MODE).contains(shuflMode)){
                System.err.println("ERROR: Wrong shuffleMode recieved '" + shuflMode + "'");
                toExit = true;
            }

            if (!Arrays.asList(HELP_MODE).contains(helpMode)){
                System.err.println("ERROR: Wrong helpMode recieved '" + helpMode + "'");
                toExit = true;
            }

            if (funds < 1 || funds > 1000000000) {
                System.err.println(("ERROR: Wrong funds recieved '" + funds + "'"));
                toExit = true;
            }

            if (toExit == true){
                System.exit(1);
            }

            while (!App.isOver()){
                
            }

        }
    
}
