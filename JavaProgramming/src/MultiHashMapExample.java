import java.util.HashMap;

public class MultiHashMapExample {

	public static void main(String[] args) {
		DuplicateMap<String,String> dm=new DuplicateMap<>();
		//HashMap<String,String> dm= new HashMap<>();
		dm.put("1", "one");
		dm.put("1", "not one");
		dm.put("1", "surely not one");
		//System.out.println(dm.get("1"));
		System.out.println(dm.get("1"));
		System.out.println(dm.get("1",1));
		System.out.println(dm.get("1", 5));
	}
}