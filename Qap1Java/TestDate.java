public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(27, 1, 2025);

        // Print the date using the toString() method
        System.out.println("The date is: " + date.toString());

        // Test setter methods
        date.setDay(15);
        date.setMonth(12);
        date.setYear(2023);

        // Print the updated date
        System.out.println("Updated date is: " + date.toString());
    }
}
