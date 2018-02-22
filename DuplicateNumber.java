package repeat;
import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
	 
    public int Duplicate(List numbers){         
        int n = numbers.size() - 1;
        System.out.println(n);
        int total = getSum(numbers);
        int dup = total - (n*(n+1)/2);
        return dup;
    }
     
    public int getSum(List numbers)
    {
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List numbers = new ArrayList();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.Duplicate(numbers));
    }
}