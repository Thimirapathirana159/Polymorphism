public class Aa {
    void method(){
    }
}
class Bb extends Aa{
    void newMethod(){
    }

    @Override
    void method() {
        System.out.println("Ab");
    }
}
class Cc extends Bb{
    @Override
    void method() {
        System.out.println("Bc");
    }

    @Override
    void newMethod() {
        System.out.println("bc");
    }
}
class TestRun{
    public static void main(String[] args) {
        Aa a = new Aa();
        a.method();
        Aa b = new Bb();
        b.method();
        Aa c = new Cc();
        c.method();
        Bb bb = new Bb();
        bb.newMethod();
        Bb cc = new Cc();
        cc.newMethod();
    }
}