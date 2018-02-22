package repeat;
public class LinearSearch {
	
	public static void Search(int[] a,int num){
		for(int i=0;i<a.length;i++){
			if(a[i]==num)
				System.out.println("The given number found at index: "+i);
		}
	}

public static void main(String[] args){
	int[] a = {1,12,65,34,8,54,23};
	Search(a,34);
}
}
