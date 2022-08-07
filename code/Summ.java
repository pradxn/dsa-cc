import java.util.Scanner;
public class Summ {
    public static void main(String[] args) {
        sum();

        int ans = sum2();
        System.out.println(ans);

        int anss = sum3(20, 30);
        System.out.println(anss);

        String message = greet();
        System.out.println(message);

        String messagee = greetName("Johnny");
        System.out.println(messagee);

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String messageee = greetName(name);
        System.out.println(messageee);

    }

    static String greetName(String name){
        String message = "Hello, " + name;
        return message;
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String greet(){
        String greeting = "hola! como estas?";
        return greeting;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum = " + sum);
    }
}
