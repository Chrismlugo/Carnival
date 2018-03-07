public class HauntedHouse extends Attraction implements IAction{
    public HauntedHouse(String name, double price, int capacity, int ageRestriction) {
        super(name, price, capacity, ageRestriction);
    }

    @Override
    public String action() {
        return "Boooo!!!";
    }

}
