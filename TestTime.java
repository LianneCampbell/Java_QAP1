public class TestTime {
    public static void main(String[] args) {
        // Creating two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Calling nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Displaying the final times for t1 and t2
        System.out.println("Final time for t1(Next Second): " + t1.toString());
        System.out.println("Final time for t2(Previous Second): " + t2.toString());
    }
}