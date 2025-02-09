class Truck {
    int cadence, gear, speed;
    //class truck memiliki 1 constructor
    Truck(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear =  startGear;
        speed = startSpeed;
    }
    //class truck memiliki 4 method
    public void setCadence(int newValue) {
        cadence = newValue;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;     //speed = speed - decrement
    }
    public void speedUp(int increment) {
        speed += increment;     //speed = speed + increment
    }

}
class MountainTruck extends Truck{
    int setHeight;
    MountainTruck(int startHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);
        setHeight = startHeight;
    }
    public void setHeight(int newValue) {
        setHeight = newValue;
    }
}

public class App{
    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MountainTruck mb = new MountainTruck(0, 0, 0, 0);
        System.out.println("gear: " + mb.gear);
        System.out.println("speed: " + mb.speed);
        mb.setGear(2);
        mb.speedUp(2);
        System.out.println("gear: " + mb.gear);
        System.out.println("speed: " + mb.speed);
        mb.speedUp(2);
        System.out.println("gear: " + mb.gear);
        System.out.println("speed: " + mb.speed);
    }
}
