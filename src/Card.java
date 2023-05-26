public class Card {

    public String name;
    public String suit;
    public int cardValue;
    public int cardNum;

    public Card(int suitNum, int cardNum) {

        if (suitNum == 0) {
            suit = "spades";
        }
        if (suitNum == 1) {
            suit = "diamonds";
        }
        if (suitNum == 2) {
            suit = "hearts";
        }
        if (suitNum == 3) {
            suit = "clubs";
        }

        if (cardNum == 0) {
            name = "ace";
            cardValue = 11;
        }
        if (cardNum == 1) {
            name = "two";
            cardValue = 2;
        }

        if (cardNum == 2) {
            name = "three";
            cardValue = 3;
        }

        if (cardNum == 3) {
            name = "four";
            cardValue = 4;
        }

        if (cardNum == 4) {
            name = "five";
            cardValue = 5;
        }

        if (cardNum == 5) {
            name = "six";
            cardValue = 6;
        }

        if (cardNum == 6) {
            name = "seven";
            cardValue = 7;
        }

        if (cardNum == 7) {
            name = "eight";
            cardValue = 8;
        }

        if (cardNum == 8) {
            name = "nine";
            cardValue = 9;
        }

        if (cardNum == 9) {
            name = "ten";
            cardValue = 10;
        }

        if (cardNum == 10) {
            name = "jack";
            cardValue = 10;
        }

        if (cardNum == 11) {
            name = "queen";
            cardValue = 10;
        }

        if (cardNum == 12) {
            name = "king";
            cardValue = 10;
        }


    }


    public void printCardInfo() {
        System.out.println(name + " of " + suit);
    }
}