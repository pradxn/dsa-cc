import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 2;
        while(n<=20){
            int temp = a+b;
            System.out.println(n + "th fibonacci number: " + temp);
            a=b;
            b=temp;
            n++;
        }
        System.out.println("Which fibonacci sequence number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        a = 0;
        b = 1;
        n = 2;
        while(n<=num){
            int temp = a+b;
            a=b;
            b=temp;
            n++;
            System.out.println(n + "th fibonacci number: " + temp);
        }
    }
}
