public class Card {

    public String name;
    public String suit;
    public int cardValue;

    public void Card(int suitNum){

        if (suitNum==0){
            suit = "spades";}
        if (suitNum ==1){
            suit = "diamonds";}
        if (suitNum==2){
            suit = "hearts";}
        if (suitNum==3){
            suit = "clubs";}

        if(cardValue == 0) {
            name = "ace";}

        if (cardValue==1){
            name = "two";}

        if (cardValue==2){
            name = "three";}

        if (cardValue==3){
            name = "four";}

        if (cardValue==4){
            name = "five";}

        if (cardValue==5){
            name = "six";}

        if (cardValue==6){
            name = "seven";}

        if (cardValue==7){
            name = "eight";}

        if (cardValue==8){
            name = "nine";}

        if (cardValue==9){
            name = "ten";}

        if (cardValue==10){
            name = "jack";}

        if (cardValue==11){
            name = "queen";}

        if (cardValue==12){
            name = "king";}


        }
    }







}
