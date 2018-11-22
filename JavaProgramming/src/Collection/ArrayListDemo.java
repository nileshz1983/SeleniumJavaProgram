package Collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args)
    {
        String[] namesArray = new String[1000000];
 
        long startTime = System.currentTimeMillis();
 
        for (int i = 0; i < namesArray.length; i++)
        {
            namesArray[i] = "Name"+i;
        }
 
        long endTime = System.currentTimeMillis();          
 
        System.out.println("Time taken by Array : "+(endTime - startTime)+"ms");
 
        ArrayList<String> nameList = new ArrayList<String>();     
 
        startTime = System.currentTimeMillis();
 
        for (int i = 0; i <= 1000000; i++)
        {
            nameList.add("Name"+i);
        }
 
        endTime = System.currentTimeMillis();
 
        System.out.println("Time taken by ArrayList : "+(endTime-startTime)+"ms");
    }

}
