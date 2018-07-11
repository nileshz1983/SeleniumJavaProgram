
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {
		HashMap<Integer, String> map =new HashMap<>();
		//DuplicateMap<Integer,String> map=new DuplicateMap<>();
		map.put(1, "Nilesh");
		map.put(2, "Vijay");
		map.put(2,"Akssss");
		map.put(4, "Ajay");

		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" - "+m.getValue());	

		}



	}

}