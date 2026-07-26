public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private int fuelLeve
    private int gear;
    private boolean headlightsOn;
    private int odometer;     
    private String direction;

    // Null / default constructor 
    public Car() {
        this.brand = "Unknown";
        this.color = "White";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.gear = 0;
        this.headlightsOn = false;
        this.odometer = 0;
        this.direction = "Straight";
    }
    // Parameterized constructor
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.gear = 0;
        this.headlightsOn = false;
        this.odometer = 0;
        this.direction = "Straight";
    }

    // ---------- Getters ----------
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isEngineOn() {
        return engineOn;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public int getGear() {
        return gear;
    }
    public boolean isHeadlightsOn() {
        return headlightsOn;
    }
    public int getOdometer() {
        return odometer;
    }
    public String getDirection() {
        return direction;
    }

    // ---------- Setters ---------
    public void setBrandColour(String brand, String Color) {
        this.brand = brand;
        this.color = color;
    }

    public void setFuelLevel(int fuelLevel) {
        // fuel can never be negative or above a full tank
        if (fuelLevel < 0) {
            this.fuelLevel = 0;
        } else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }
    
    // ---------- Behaviours ----------
    public void startEngine() {
        if (fuelLevel <= 0) {
            System.out.println(brand + " won't start - tank is empty.");
            return;
        }
        engineOn = true;
        System.out.println(brand + "'s engine started.");
    }

    public void stopEngine() {
        this.engineOn = false;
        this.speed = 0; 
        this.gear = 0;   
        System.out.println(brand + "'s engine stopped.");
    }

    public void drive() {
        if (!engineOn) {
            System.out.println(brand + ": start the engine first.");
            return;
        }
        if (fuelLevel <= 0) {
            System.out.println(brand + " is out of fuel.");
            return;}
        
        speed += 20;
        fuelLevel -= 5;
        odometer += 1;
        if (fuelLevel < 0) {
            fuelLevel = 0;}
        System.out.println(brand + " is now driving at " + speed + " km/h.");
    }

    public void moveFast() {
        if (!engineOn) {
            System.out.println(brand + ": can't speed up with the engine off.");
            return;
        }
        if (fuelLevel <= 0) {
            System.out.println(brand + " is out of fuel.");
            return;
        }

        speed += 30;
        fuelLevel -= 10;
        odometer += 2;

        if (fuelLevel < 0) {
            fuelLevel = 0;
        }

        System.out.println(brand + " sped up to " + speed + " km/h.");
    }

    public void moveSlow() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down to " + speed + " km/h.");
    }

    public void moveLeft() {
        direction = "Left";
        System.out.println(brand + " turned left.");
    }
    public void moveRight() {
        direction = "Right";
        System.out.println(brand + " turned right.");
    }
    public void changeGear(int gear) {
        if (!engineOn) {
            System.out.println(brand + ": turn the engine on before changing gear.");
            return;
        }
        if (gear >= 0 && gear <= 5) {
            this.gear = gear;
            System.out.println(brand + " shifted to gear " + gear + ".");
        } else {
            System.out.println(brand + ": invalid gear.");
        }
    }

    // Thrilling feature - a short burst of extra speed, but it costs a lot
    // of fuel and only works if there's enough fuel to spare.
    public void turboMode() {
        if (!engineOn) {
            System.out.println(brand + ": turbo needs the engine running.");
            return;
        }
        if (fuelLevel < 20) {
            System.out.println(brand + ": not enough fuel for turbo.");
            return;
        }

        speed += 50;
        fuelLevel -= 20;
        odometer += 3;
        System.out.println(brand + " engaged TURBO MODE! Speed: " + speed + " km/h.");
    }

    // ---------- Display ----------
    public void displayState() {
        System.out.println("---- " + brand + " ----");
        System.out.println("Color       : " + color);
        System.out.println("Speed       : " + speed + " km/h");
        System.out.println("Engine On   : " + engineOn);
        System.out.println("Fuel Level  : " + fuelLevel + "%");
        System.out.println("Gear        : " + gear);
        System.out.println("Headlights  : " + headlightsOn);
        System.out.println("Odometer    : " + odometer + " km");
        System.out.println("Direction   : " + direction);
        System.out.println();
    }
}
