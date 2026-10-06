import java.io.*;
public class file {
    public static void main(String[] args) {
        String filename = "test.txt";
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("Hello, this is a test file.\n");
            fw.write("This is the second line.");
            fw.close();
            FileReader fr = new FileReader(filename);
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
