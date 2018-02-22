package repeat;

public class reverse {

	public int reverse(int number){		
		int reverse = 0;
		while(number != 0){
			reverse = (reverse*10)+(number%10);
			number = number/10;
		} 
		return reverse;
	}
	
	public static void main(String a[]){
		reverse nr = new reverse();
		System.out.println("Result: "+nr.reverse(99));
	}
}