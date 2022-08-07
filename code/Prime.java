import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int num){
        int c = 2;
        if (num<=1){
            return false;
        }
        while (c*c<=num){
            if (num%c==0){
                return false;
            }
            c++;
        }if(c*c>num){
            return true;
        }
        return false;
        }
    }