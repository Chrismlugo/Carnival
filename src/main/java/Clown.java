public class Clown extends Person {


    public Clown(String name) {
        super(name);
    }

    public String throwsPie(Person person){
        return getName() + " throws pie at " + person.getName() + "...Splat!";
    }


}
