package sectionthree;

public class Calender {
    public static void main(String[] args) {
        String day = "friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");

        switch (day) {
            case "monday": System.out.println("Sorry, I have to stay at work late.");
            break;
            case "tuesday": System.out.println("It looks like I have meetings all day.");
            break;
            case "wednesday": System.out.println("I have a dentist appointment. Some other time!");
            break;
            case "thursday": System.out.println("Sorry, thursday is date night!");
            break;
            case "friday": System.out.println("Im free!!!");
            break;
            case "saturday": System.out.println("Im free!!!");
            break;
            case "sunday": System.out.println("Im free!!!");
            break;
            default: System.out.println("That's not a day");
        }
    }
}
