import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorSorting {
	
	public static void main(String[] args) {
		
		Integer integerArray[] = {1,66,88,100, 201};
		List <Integer> num= new ArrayList<Integer>();
		Random r= new Random();
		
		for(int i=0;i<1000;i++) {
			num.add(r.nextInt(1000));
		}
		 
		Comparator<Integer > compare= new sorting();
		Collections.sort(num, compare);
		
		for(Integer o:num)
		{
			System.out.println(o);
		}
	}

}

class sorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		int diff=(o1%10>o2%10)?-1:(o1%10<o2%10)?1:0;
		return diff;
	}
	
}