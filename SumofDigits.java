package repeat;
import java.util.Scanner;
public class SumofDigits {
    public static int sum(int n){
        return n==0 ? 0 : n%10+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits of "+num + " is: " + sum(num));
    }
}