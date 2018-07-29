package javaconceptoftheday;

import java.util.ArrayList;
import java.util.List;

//java program to find second largest number in an integer array
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,6,7,8,1,9};
		int firstLargest=a[0];
		int secondLargest=a[1];
		
		for(int i=1;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					secondLargest=firstLargest;	
					firstLargest=a[i];
					//list.add(a[j]);
				}
				
			}
		}
	}

	
	static void secondlartestno(int []a)
	{
		List <Integer> list= new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					list.add(a[j]);
				}
				
			}
		}
	}
}
