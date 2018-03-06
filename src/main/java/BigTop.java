public class BigTop extends Attraction {
    public BigTop(String name, double price, int capacity, int ageRestriction, int heightRestriction) {
        super(name, price, capacity, ageRestriction, heightRestriction);
    }

    @Override
    public String action() {
        return "argh! the lion has eaten the lion tamer!";
    }


}
