import java.util.ArrayList;

public class Casino {
    ArrayList<Card>deck;
    int score;

    public static void main(String[] args) {
        Casino game = new Casino();
    }

    public Casino(){
        for (int x = 0; x<4; x++) {
            for(int y = 0; y<13;y++){
                deck.add(new Card());
            }
        deck = new ArrayList<>();
            deck.add(new Card());


    }








}
