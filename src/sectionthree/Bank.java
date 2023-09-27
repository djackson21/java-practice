package sectionthree;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("\n****ROYAL BANK OF JAVA****");
            System.out.println("Are you here to get a mortgage? (yes or no)");
            //Task 1 - Pick up the user's decision.
            // using if statement for decision
            String user = scan.nextLine();
            if (user.equals("yes") || user.equals("Yes")) {
                    //Task 2 - Print this if the decision is "yes"
                    System.out.println("\nGreat! In one line" +
                            "\nHow much money do you have in your savings?" +
                            "\nAnd, how much do you owe in credit card debt?");

                    int savings = scan.nextInt();
                    int debt = scan.nextInt();
                    scan.nextLine();

                    // Task 3 - Pick up each value
                    System.out.println("\nHow many years have you worked for?");

                    int yearsWorked = scan.nextInt();
                    scan.nextLine();

                    System.out.println("What is your name?");
                    String name = scan.nextLine();
                    // Task 5 - Pick up the user's name
                    //Task 6 - Approve the mortgage if they meet the requirements (see article)
                    //       - Otherwise, don't give them a mortgage.

                    if (savings >= 10000 && debt <= 5000 && yearsWorked > 2){
                            System.out.println("Congratulations " + (name) + " You have been approved!");
                    } else {
                            System.out.println("Sorry " + (name) + ", you are not eligible for a mortgage.");
                    }

            } else if (user.equals("no") || user.equals("No")) {
                    //Task 2 - Print this if the decision was not "yes"
                    System.out.println("\nOK. Have a nice day!");
            } else {
                    System.out.println("invalid response");
            }
            scan.close();
    }
}
