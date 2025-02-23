public class MethodOverloading {
    public static void main(String[] args) {
        // Calling the overloaded methods with different parameter types
        printValue(10);       // Integer value
        printValue(3.14);     // Double value
        printValue("Hello!"); // String value
    }

    // Overloaded method to print an integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Overloaded method to print a double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Overloaded method to print a string value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
