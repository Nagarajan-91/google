package repeat;
public class BinarySearch 
{
	
// Complexity | O(LogN)

	public int BS(int item, int[] list) 
	{
		int index = -1;
		int l = 0,h = list.length-1,mid;
		while (h >= l) 
		{
			mid = (h + l)/2;
			if (item < list[mid]) 
			{
				h = mid - 1; 
			}
			else if (item > list[mid])
			{
				l = mid + 1;
			} 
			else 
			{
				index = mid;
				break;
			}
		}
		return index;
	}

}
