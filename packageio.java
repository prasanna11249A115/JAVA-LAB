import java.io.File;
class packageio {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
