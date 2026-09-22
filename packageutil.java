import java.util.Scanner;

class packageutil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Length of name: " + name.length());

        scanner.close();
    }
}