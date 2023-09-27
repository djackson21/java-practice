package sectionfour;

public class Parameter {
    public static void main(String[] args) {

        calculateArea(2.3,55.5);
        calculateArea(34.3,23.5);
        calculateArea(6.3,8.5);


    }

    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
