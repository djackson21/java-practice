package sectionthree;

public class JavaMart {
    public static void main(String[] args) {

        //if -else

        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        //if you have enough money
        //       print: Sure!
        //       pay for the toy car

        //else:  Sorry, I only have <wallet> left.

        if (wallet >= toyCar) {
            System.out.println("Sure!\n");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only " + (wallet) + " left.");
        }

        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");

        if (wallet >= nike) {
            System.out.println("Sure!\n");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only " + (wallet) + " left.");
        }
    }
}
