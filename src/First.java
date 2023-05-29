public class First {
    int x = 5;
    static  void my_first() {
        System.out.println("This is my first method");
    }

    public static void main (String[] args) {
        my_first();
        System.out.println(my_second(5,15));

        First myObj = new First();
        System.out.println(myObj.x);
    }

    //add the numbers between 5 and 15
    public static int my_second(int fnum, int snum){
        if (snum>fnum) {
            return fnum + my_second(fnum, snum-1);
        } else {
            return snum;
        }
    }

    // difference between public & static methods
    // for static methods you don't need to create an object for
    // the class to access the method and vice versa
}
