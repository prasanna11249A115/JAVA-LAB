 class person {
    void walk() {
        System.out.println("walking...");
    }
}
class student extends person {
    void study() {
        System.out.println("studying...");
    }
}
public class si {
    public static void main(String args[]) {
        student s = new student();
        s.study();
        s.walk();
    }
}