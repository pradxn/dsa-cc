import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isArm(num);
        System.out.println(ans);

        for (int i = 0; i<=10000; i++){
            if (isArm(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArm(int num) {
        int original = num;
        int sum = 0;

        while (num>0){
            int rem = num%10;
            num = num/10;
            sum = sum + (rem*rem*rem); //rem count is same as digit length
        }
        if (sum==original){
            return true;
        }else{
            return false; //or just return sum==original instead of true or false
        }
    }
}
