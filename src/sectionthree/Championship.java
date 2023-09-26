package sectionthree;

public class Championship {
    public static void main(String[] args) {
        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor wins!!");
        } else if (margin >= 0) {
            System.out.println("2nd Place!!");
        } else if (margin >= -100) {
            System.out.println("3rd Place!!");
        } else {
            System.out.println("You lose");
        }
    }
}
