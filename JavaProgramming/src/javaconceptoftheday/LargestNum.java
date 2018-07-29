package javaconceptoftheday;

import java.sql.Array;
import java.util.Arrays;

//find largest number less than a given number and without a given digit
/*Write a java program to find the largest number ‘L’ less than a given number 
‘N’ which should not contain a given digit ‘D’. 
For example, If 145 is the given number and 4 is the given digit, 
then you should find the largest number less than 145 such that it
should not contain 4 in it. In this case, 139 will be the answer. */
public class LargestNum {

	public static void main(String[] args) {

		int num=546;
		int temp=0;
		while(num!=0)
		{
			temp = num/10;
			//System.out.println("temp---"+temp);
			break;

		}
		System.out.println("temp"+temp);
		int newnum=temp-1;

		System.out.println(newnum);
		String unitnum="9";
		String largestnum= String.valueOf(newnum)+unitnum;
		System.out.println("largestnum--- "+largestnum);
		
	}

}
