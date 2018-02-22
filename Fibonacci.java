package repeat;
import java.util.Scanner;
public class Fibonacci {
	public static int Fib(int a){
		return (a<=1) ? a : Fib(a-1)+Fib(a-2);
	}
	public static void main(String args[]){
		int n;
		Scanner in = new Scanner(System.in);
                System.out.println("Enter a number: ");
                n = in.nextInt();
                for(int i=0;i<=n-1;i++)
                System.out.print(Fib(i)+" ");
                in.close();
	}
}
