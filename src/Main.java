public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        System.out.println(" this is a text");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int one = 1;
        String name = "ama";
        double dec = 9.0223;

        System.out.println(name+dec);

        char val = 65;
        System.out.println(val);
        int x=50, y=25, z =34;
        System.out.println(x%z);

        System.out.println(Math.abs(-4.7));

        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enjoy your weekend");
        }
    }
}