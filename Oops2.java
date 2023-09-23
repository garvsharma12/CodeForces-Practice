class Vehicle {
    int gearChange(int n){
        System.out.println("GearChange");
        return n+4;
    }
    int  speedChange(int n){
        System.out.println("Change the Gear to speed 50KPH ");
        return n+100;
    }
    int  noOfVehicle(int n){
        System.out.println("Vehicle Numbers"); return n+1;
    }
    int maxSpeed(int n){
        System.out.println("Max Speed"); return n+200;
    }
}
class motorCycle extends Vehicle{
    int speedChange(int n){
        System.out.println("Change the speed to 100KPH");
        return n+200;
    }
}
class Car extends  Vehicle{
    int gearChange(int n){
        System.out.println("Gear Changed ::");
        return n+2;
    }
}
public class Oops2{
    public static void main(String[] args) {
        Vehicle obj1 = new motorCycle();
        obj1.speedChange(50);
        Vehicle obj2 = new Car();
        obj2.gearChange(1);
    }
}
