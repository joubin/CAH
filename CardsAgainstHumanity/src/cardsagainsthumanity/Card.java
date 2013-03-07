package cardsagainsthumanity;

public class Card {
    private String name;
    public Card(String aName){
        name = aName;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
