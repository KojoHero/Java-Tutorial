public class Second {
    // Create a Car object named myCar. Call the fullThrottle() and speed()
    // methods on the myCar object, and run the program:
    String Car = "Volvo";

    public void fullThrottle(){
        System.out.println("The car is going on full throttle");
    }

    public void speed(){
        System.out.println("the car has started speeding");
    }

    public static void main (String[] args) {
        Second myCar = new Second();
        myCar.fullThrottle();
        myCar.speed();
        System.out.println(myCar.Car);
    }
}
