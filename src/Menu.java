/*
Menu.java
Spencer Renfro
8-23-2025
Purpose:
Prints menu
Gets user input
Constructs shape
Asks if user wants to continue
If yes, repeats
If no, prints terminate message and exits
*/

import java.util.Scanner;
import java.time.LocalDateTime;
import java.lang.StringBuilder;
import Shapes.*;


public class Menu {
    // Prints selection menu
    public static void printMenu() {
        System.out.println("\n*********Welcome to the Java OO Shapes Program **********");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit the program");
    }
    // Prints terminate message
    public static void printTerminateMessage(){
        int monthInt = LocalDateTime.now().getMonthValue();
        String month = "";
        String meridiem = "";
        int day = LocalDateTime.now().getDayOfMonth();
        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        month = switch (monthInt) {
            case 1 -> "Jan ";
            case 2 -> "Feb ";
            case 3 -> "Mar ";
            case 4 -> "Apr ";
            case 5 -> "May";
            case 6 -> "Jun ";
            case 7 -> "Jul ";
            case 8 -> "Aug ";
            case 9 -> "Sep ";
            case 10 -> "Oct ";
            case 11 -> "Nov ";
            case 12 -> "Dec ";
            default -> month;
        };

        if (hour > 12) {
            hour -= 12;
            meridiem = "PM";
        }
        else meridiem = "AM";

        StringBuilder dateString = new StringBuilder();
        dateString.append("Thanks for using the program. Today is ");
        dateString.append(month + day);
        dateString.append(" at " + hour + ":" + minute + " " +meridiem);
        System.out.println(dateString);
    }
    // Constructs shape based on user input
    public static boolean constructShape(int choice, boolean running) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double h = 0;
        double l = 0;
        double w = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                 r = sc.nextDouble();
                Circle c = new Circle(r);
                System.out.println("Area of Circle = " + c.getArea());
                break;
            case 2:
                System.out.println("You have selected a Rectangle");
                System.out.println("What is the length?");
                l = sc.nextDouble();
                System.out.println("What is the width?");
                w = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(l, w);
                    System.out.println("Area of Rectangle = " + rectangle.getArea());
                break;
            case 3:
                System.out.println("You have selected a Square");
                System.out.println("What is the side length?");
                l = sc.nextDouble();
                Square square = new Square(l);
                System.out.println("Area of Square = " + square.getArea());
                break;
            case 4:
                System.out.println("You have selected a Triangle");
                System.out.println("What is the base length?");
                l = sc.nextDouble();
                System.out.println("What is the height?");
                h = sc.nextDouble();
                Triangle triangle = new Triangle(l, h);
                System.out.println("Area of Triangle = " + triangle.getArea());
                break;
            case 5:
                System.out.println("You have selected a Sphere");
                System.out.println("What is the radius?");
                r = sc.nextDouble();
                Sphere sphere = new Sphere(r);
                System.out.println("Volume of Sphere = " + sphere.getVolume());
                break;
            case 6:
                System.out.println("You have selected a Cube");
                System.out.println("What is the side length?");
                l = sc.nextDouble();
                Cube cube = new Cube(l);
                System.out.println("Volume of Cube = " + cube.getVolume());
                break;
            case 7:
                System.out.println("You have selected a Cone");
                System.out.println("What is the radius?");
                r = sc.nextDouble();
                System.out.println("What is the height?");
                h = sc.nextDouble();
                Cone cone = new Cone(r, h);
                System.out.println("Volume of Cone = " + cone.getVolume());
                break;
            case 8:
                System.out.println("You have selected a Cylinder");
                System.out.println("What is the radius?");
                r = sc.nextDouble();
                System.out.println("What is the height?");
                h = sc.nextDouble();
                Cylinder cylinder = new Cylinder(r, h);
                System.out.println("Volume of Cylinder = " + cylinder.getVolume());
                break;
            case 9:
                System.out.println("You have selected a Torus");
                System.out.println("What is the major radius?");
                r = sc.nextDouble();
                System.out.println("What is the minor radius?");
                h = sc.nextDouble();
                Torus torus = new Torus(r, h);
                System.out.println("Volume of Torus = " + torus.getVolume());
                break;
            case 10:
                running = false;
                break;
            default:
                System.out.println("Invalid choice.");
        }
        return running;
    }
    // looping prompt that asks user if they want to continue
    public static boolean continueProgram(boolean running) {
        Scanner sc = new Scanner(System.in);
        char choice = ' ';
        System.out.println("Would you like to continue? Enter Y or N");
       while(choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {

           choice = sc.next().charAt(0);
           if (choice == 'n' || choice == 'N') {
               choice = 'N';
               running = false;
           }
           else if (choice == 'y' || choice == 'Y') choice = 'Y';
           else System.out.println("Sorry I do not understand. Enter Y or N");
       }
        if (choice == 'n' || choice == 'N') return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = sc.nextInt();
            running = constructShape(choice, running);
            if(choice != 10) running = continueProgram(running);
            if(!running) printTerminateMessage();
        }
        sc.close();
    }
}
