package theme03Inheritance.exercise.p04NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle(50, 100);
        SportCar sportCar = new SportCar(100, 300);

        System.out.println(moto.getFuelConsumption());
        System.out.println(sportCar.getFuelConsumption());

        System.out.println("Moto:");

        System.out.println(moto.getFuel());
        moto.drive(30);
        System.out.println(moto.getFuel());


        System.out.println("SportCar:");

        System.out.println(sportCar.getFuel());
        sportCar.drive(9);
        System.out.println(sportCar.getFuel());
    }
}
