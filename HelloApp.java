public class HelloApp {
    public static void main(String[] args) {
        // Use a ternary operator to assign the name based on argument availability
        String name = (args.length > 0) ? args[0] : "World";
        
        // Output the personalized or default greeting
        System.out.println("Hello, " + name + "!");
    }
}