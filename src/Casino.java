import java.util.ArrayList;

public class Casino {
    ArrayList<Card>deck;
    int score;

    public static void main(String[] args) {
        Casino game = new Casino();
    }

    public Casino(){
<<<<<<< HEAD
        for (int x = 0; x<4; x++) {
            for(int y = 0; y<13;y++){
                deck.add(new Card());
            }
        deck = new ArrayList<>();
            deck.add(new Card());


    }





=======
        createDeck();
        printDeck();
}



public void createDeck(){
        deck = new ArrayList<>();
    for (int x = 0; x<4; x++) {
        for(int y = 0; y<13;y++){
            deck.add(new Card(x,y));
        }
    }
}

public void printDeck(){
    for (int x = 0; x<52;x++){
        deck.get(x).printCardInfo();
    }
}
>>>>>>> b27d6de (final deck)



}
<<<<<<< HEAD
=======


>>>>>>> b27d6de (final deck)
