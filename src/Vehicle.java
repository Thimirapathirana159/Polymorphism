public class Vehicle {
    void drive(){
        System.out.println("Drive speed limit 100kmph");
    }
}
class Car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Drive speed limit 150kmph");
    }
}
class Run{
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle v = new Vehicle();
        c.drive();
        v.drive();
    }
}