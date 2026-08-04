public class variabledemo {
    int instancevariance = 10;
    static String staticvar = "i am  static ";
    public void showvariable() {
        int localvar = 5;
        System.out.println("instance variance: " + instancevariance);
        System.out.println("static variable: " + staticvar);
        System.out.println("local variable: " + localvar);
    }
    public static void main(String[] args) {
        variabledemo obj1 = new variabledemo();
        obj1.showvariable();
        System.out.println("accessing static variable without creating object: " + variabledemo.staticvar);
    }
}
