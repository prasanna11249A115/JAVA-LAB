class university {
    void provideeeducation() {
        System.out.println("providing education...");
    }
}
class college extends university {
    void provideeducation() {
        System.out.println("providing college education...");
    }
}
class professor extends college {
    void provideprofeducation() {
        System.out.println("providing professor education...");
    }
}
public class mi {
    public static void main(String args[]) {
        college c = new college();
        c.provideeducation();
        c.provideeeducation();
    }
}