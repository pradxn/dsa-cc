import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans = (ans * 10) + temp;
            n = n/10;
        }
        System.out.println(ans);
    }
}
