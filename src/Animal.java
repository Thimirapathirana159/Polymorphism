public class Animal {
    void eat(){
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Eating any food");
    }
}
class Lion extends Animal{
    @Override
    void eat() {
        System.out.println("Eating meat only");
    }
}
class RunCode{
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal l = new Lion();
        d.eat();
        l.eat();
    }
}