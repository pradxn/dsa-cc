import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello. Welcome to loops");
        System.out.println("if - condition");
        int salary = 20000;
        if (salary>=15000){
            salary = salary + 2000;
            System.out.println("New salary: "+salary);
        }else{
            salary = salary + 1000;
            System.out.println("New salary: "+salary);
        }
        System.out.println("while loop");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a<=20){
            System.out.println("Number: " + a);
            a++;
        }
        System.out.println("for loop");
        System.out.println("Multiplication table of " + a); //a value now is 20
        for (int n = 200; a<=n; a++){
            System.out.println(a + "*" + n + "=" + a*n);
        }
        System.out.println("End!");
    }
}