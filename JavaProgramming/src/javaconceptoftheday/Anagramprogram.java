package javaconceptoftheday;

import java.util.Arrays;

public class Anagramprogram {

	public static void main(String[] args) {
		
		String name1="Mother In Law";
		String name2="Witler 1Homan";
		
		String name1copy= name1.replaceAll("\\s", "").toLowerCase();
		String name2copy= name2.replaceAll("\\s", "").toLowerCase();
		
		System.out.println("name1copy---"+ name1copy +"---name2copy--"+ name2copy );
		char[] char1=name1copy.toCharArray();
		char[] char2=name2copy.toCharArray();
		//boolean status= false;
		if(name1copy.length()!=name2copy.length())
		{
			System.out.println("not Anagram");
			return;
		}
		
		if(name1copy.length()==name2copy.length())
		{
			Arrays.sort(char1);
			Arrays.sort(char2);
		
			boolean status=Arrays.equals(char1, char2);
			
			if(status) {
				System.out.println("Anagram");
			}else
			{
				System.out.println("noyyy Anagram");
			}
			
		}
		

	}

}
