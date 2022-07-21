package theme05Polymorphism.exercise.p03WildFarm_00;

public abstract class Food {
    private Integer quantity;

    public Food(){

    }

    protected Food(Integer foodQuantity) {
        this.quantity = foodQuantity;
    }

    protected Integer getFoodQuantity() {
        return quantity;
    }

//    protected void eatFood(Integer quantity) {
//        this.quantity = this.getFoodQuantity() + quantity;
//    }
}
