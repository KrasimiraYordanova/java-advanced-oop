import java.util.Scanner;

public class CardSuitMain {
    //public static void main(String[] args) {
        //System.out.println("Card Suits:");
        //for (CardSuit cardSuit: CardSuit.values()) {
            //System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
        //}
    //}

    //public static void main2(String[] args) {
        //System.out.println("Card Ranks:");
        //for (CardRank cardRank: CardRank.values()) {
            //System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        //}
    //}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());
        int cardPower = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, cardPower);
    }
}