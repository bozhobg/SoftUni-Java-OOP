package theme05Polymorphism.lab.p03Animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        return String.format("%s%nMEEOW", super.explainSelf());
    }
}
