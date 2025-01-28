public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set their time using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display times before modification
        System.out.println("Before modification:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display final times
        System.out.println("\nAfter modification:");
        System.out.println("t1 (after nextSecond): " + t1.toString());
        System.out.println("t2 (after previousSecond): " + t2.toString());
    }
}
