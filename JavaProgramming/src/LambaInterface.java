import java.util.ArrayList;

public class LambaInterface {

	public static void main(String[] args) {
	int sum=0;
	ArrayList<Integer> list= new ArrayList<>();
	list.add(1);
	list.add(5);
	list.add(6);
	list.add(7);
	
	for(int a:list)
	{
		sum=sum+a;
		
		}
	list.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	System.out.print(sum);
	}

}
