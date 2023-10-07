public class InstanceOfPatternMatching {
    public static void main(String[] args) {
        Object someObject = "Hello, Java 16!";
        if (someObject instanceof String str) {
            System.out.println("It's a String: " + str);
        } else {
            System.out.println("It's not a String");
        }
    }
}
