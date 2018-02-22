
package repeat;
public class Cont {
	
	public static void main(String[] args)
	{
		String ip="abbdaef";  
		char [] input = ip.toCharArray(); 
		System.out.println("Duplicate Characters are:"); 
		for(int i=0;i<ip.length();i++) 
		{ 
		for(int j=i+1;j<ip.length();j++) 
		{ 
		if(input[i]==input[j]) 
		{ 
		System.out.println(input[j]); 
				} 
    }
}
	}

}
