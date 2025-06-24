import java.util.ArrayList;

public class Player{
    
    private ArrayList<String> hand;
    private int id;
    private int funds;
    private int betAmount;

    public Player(int id, int funds){
        this.id = id;
        this.funds = funds;
        this.hand = new ArrayList<>();
        this.betAmount = 0;
    }

    //Get funcs
    public int getId(){
        return id;
    }
    public int getFunds(){
        return funds;
    }
    public ArrayList<String> getHand(){
        return hand;
    }
    public int getBetAmount(){
        return betAmount;
    }

    //Other
    public void recieveCard(String card){
        hand.add(card);
    }

    public void placeBet(int amount){
        betAmount += amount;
        funds -= amount;
    }

    public void bust(){
        hand.clear();
        betAmount = 0;
    }

    public void win(){
        hand.clear();
        funds += 2*betAmount;
        betAmount = 0;
    }

    public void surrender(){
        hand.clear();
        funds += 0.5*betAmount;
        betAmount = 0;
    } 
}