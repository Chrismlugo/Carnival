public class BigWheel extends Attraction implements IAction {
    public BigWheel(String name, double price, int capacity, int ageRestriction) {
        super(name, price, capacity, ageRestriction);
    }

    @Override
    public String action() {
        return "Whoooo!!";
    }


}
