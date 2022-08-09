package WorkingWithAbstraction.CardRank;

public class Main {
    public static void main(String[] args) {
        for (Ranks card : Ranks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());

        }


    }
}
