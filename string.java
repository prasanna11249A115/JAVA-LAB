public class string {
    public static void main(String[] args) {
        String str = "java programming";
        System.out.println("original string: " + str);
        System.out.println("string in uppercase: " + str.toUpperCase());
        System.out.println("string in lowercase: " + str.toLowerCase());
        System.out.println("substring:" + str.substring(5, 16));
        System.out.println("contains 'java':" + str.contains("java"));
    }
}