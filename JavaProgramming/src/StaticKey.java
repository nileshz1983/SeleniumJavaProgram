
public class StaticKey {
	
	 static String Company;
	
	static 
	{
		System.out.println("inside static");
		Company="mastercard";
	}

	public static void main(String[] args) {
		
		
		StaticKey k=new StaticKey();
		Emp e=  k.new Emp(102, "a", Company);
		Emp e1=  k.new Emp(132, "a3",Company);

	}

	
	class 	Emp{
		
		int id; 
		String Name;
		
		
		Emp(int id, String Name, String comp){
			System.out.println("inside constructor");
			id=id;
			Name=Name;
			Company=comp;
			
			System.out.println(id+" "+Name+ " "+Company);
			
			
		}
	}
}

