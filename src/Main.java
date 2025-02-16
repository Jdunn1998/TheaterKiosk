import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        //Get user Data
        System.out.println("Please enter your Age. ");
        int userAge = in.nextInt();

        //Conditionals
        if (userAge >= 21){
            System.out.println("Please collect your wristband! ");}
        else if (userAge < 21) {
            System.exit(0);}
            else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }