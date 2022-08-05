
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter numbers to be added: ");
        System.out.println("Num - 1: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Num - 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }    
}
