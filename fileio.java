import java.io.*;

class fileio {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write("Hello, this is a test file.\n".getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("test.txt");

            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
