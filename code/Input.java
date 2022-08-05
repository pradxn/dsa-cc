import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter student data");
        System.out.println("Enter name: ");
        Scanner name = new Scanner(System.in);
        name.nextLine();
        System.out.println("Enter roll: ");
        Scanner roll = new Scanner(System.in);
        roll.nextInt();
        System.out.println("Enter marks: ");
        Scanner marks = new Scanner(System.in);
        marks.nextFloat();
        System.out.println("Is pass?: ");
        Scanner pf = new Scanner(System.in);
        pf.nextBoolean();
        System.out.println("Thank you!");
    }   
}