import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Given a string , you have to count the number of occurrences of each character in it. 
For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of 
each character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.*/

public class CountCharInString {

	public static void main(String[] args) {
		String name= "Fresh Fish";

		char [] charseq=name.toCharArray();

		HashMap<Character, Integer> map= new HashMap<>();

		for(char c:charseq)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		/*below code To Find  Characters and its count In A String */
		/*for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}*/
		
		
		/*below code To Find Duplicate Characters In A String */
		Set <Character> dupchar= map.keySet();
		for(Character chardup:dupchar)
		{
			
			if(map.get(chardup)> 1)
					{
				System.out.println(chardup +" "+map.get(chardup));
					}
		}
		
		
	}
}
