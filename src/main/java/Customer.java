public class Customer {
    private String name;
    private double cash;
    private int age;
    private int height;


    public Customer(String name, double cash, int age, int height) {
        this.name = name;
        this.cash = cash;
        this.age = age;
        this.height = height;
    }

    public double getCash() {
        return cash;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
