public class HauntedHouse extends Attraction{
    public HauntedHouse(String name, double price, int capacity, int ageRestriction, int heightRestriction) {
        super(name, price, capacity, ageRestriction, heightRestriction);
    }

    @Override
    public String action() {
        return "Boooo!!!";
    }

}
