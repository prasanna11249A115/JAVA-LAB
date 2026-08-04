class Animal {
    final void display() {
        System.out.println("this is an animal");
    }
}
class Dog extends Animal {
}
public class finalmethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}