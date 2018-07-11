
/*Write a java program to find the largest number ‘L’ less than a given 
number ‘N’ which should not contain a given digit ‘D’. For example, 
If 145 is the given number and 4 is the given digit, then you should find 
the largest number less than 145 such that it should not contain 4 in it. 
In this case, 139 will be the answer.*/

public class LargestNum {

	public static void main(String[] args) {
		int a=145;
		int digit=4;
		boolean flag = false;
		//int 
		String num= Integer.toString(a);
		char c = Integer.toString(digit).charAt(0);
			int count= a;
			int i;
				for( i= a; i>0;i--)
				{
					if(Integer.toString(i).contains(Integer.toString(digit)))
					{
						count--;
					}else {
						System.out.println(Integer.toString(i));
						break;
					}
				}
		

	}

}
