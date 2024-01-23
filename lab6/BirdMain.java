abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird{
    void fly(){
        System.out.println("Eagle fly method");
    }
    void makeSound() {
        System.out.println("Eagle sound method");
    }
}
class Hawk extends Bird{
    void fly() {
        System.out.println("Hawk fly method");
    }
    void makeSound() {
        System.out.println("Hawk sound method");
    }
}
class BirdMain {
    public static void main(String[] args) {
        Eagle e = new Eagle(); Hawk h = new Hawk();
        e.fly();h.fly();e.makeSound();h.makeSound();
    }
}
