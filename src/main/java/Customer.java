public class Customer extends Person {
    private double cash;
    private int age;



    public Customer(String name, double cash, int age) {
       super(name);
        this.cash = cash;
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public int getAge() {
        return age;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
