package WorkingWithAbstraction.CardPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        CardRanks ranks = CardRanks.valueOf(scanner.nextLine());
         CardSuits cards = CardSuits.valueOf(scanner.nextLine());

         Card card = new Card(cards,ranks);
        System.out.printf("Card name: %s of %s; Card power: %d",card.getRanks(),card.getCards(),card.getCards().power+card.getRanks().power);
    }
}
