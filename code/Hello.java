
import java.util.Scanner;
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("How are you?");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("You said "+ input.nextLine());
        }
    }
}