public class BigTop extends Attraction implements IAction {
    public BigTop(String name, double price, int capacity, int ageRestriction) {
        super(name, price, capacity, ageRestriction);
    }

    @Override
    public String action() {
        return "argh! the lion has eaten the lion tamer!";
    }


}
