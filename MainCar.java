public class MainCar {
    public static void main(String[] args) {

        // audi - built with the default constructor
        Car audi = new Car();
        audi.setBrand("Audi R8");
        audi.setColor("Black");

        // bmw - built with the parameterized constructor directly
        Car bmw = new Car("BMW M4", "Grey");

        System.out.println("===== Starting state of both cars =====");
        audi.displayState();
        bmw.displayState();
        
        System.out.println("===== Audi in action =====");
        audi.startEngine();
        audi.drive();
        audi.moveFast();
        audi.moveLeft();
        audi.changeGear(3);
        audi.turboMode();
        audi.displayState();
        
        
        System.out.println("===== BMW in action =====");
        bmw.setHeadlightsOn(true);
        bmw.startEngine();
        bmw.drive();
        bmw.moveRight();
        bmw.changeGear(1);
        bmw.moveSlow();
        bmw.displayState();

        // Evidence that engine-off rules are enforced
        System.out.println("===== Stopping audi and testing rules =====");
        audi.stopEngine();
        audi.drive();          // should refuse - engine is off
        audi.moveFast();       // should refuse - engine is off
        audi.displayState();

    }
}
