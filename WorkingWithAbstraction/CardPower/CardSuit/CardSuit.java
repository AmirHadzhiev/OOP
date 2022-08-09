package WorkingWithAbstraction.CardSuit;

public class CardSuit {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (Cards card : Cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());
        }


    }
}
