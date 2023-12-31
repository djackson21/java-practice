package sectionthree;

public class AskJava {
    public static void main(String[] args) {
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n"); //"<compare change and price>"
        //comparison here
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacity >= people) + "\n"); //"<compare capacity and people>"
        //comparison here

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request.equals(purchase)) + "\n"); //"<compare request and purchase>
        //comparison here

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (space >= guests) + "\n"); //"<compare space and guests>"
        //comparison here

        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n"); //"<compare your votes and competitor>"

    }
}
