package WorkingWithAbstraction.CardPower;

public class Card {
    private CardSuits cards;
    private CardRanks ranks;

    public Card(CardSuits cards, CardRanks ranks) {
        this.cards = cards;
        this.ranks = ranks;
    }

    public CardSuits getCards() {
        return cards;
    }

    public void setCards(CardSuits cards) {
        this.cards = cards;
    }

    public CardRanks getRanks() {
        return ranks;
    }

    public void setRanks(CardRanks ranks) {
        this.ranks = ranks;
    }
}
