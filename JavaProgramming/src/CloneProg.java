
public class CloneProg {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.a=10;
		t.b=20;
		Test t1= (Test) t.clone();
		//t1=t;
		t1.a=30;
		//t1.b=40;
		System.out.println(t.a + "  "+t.b);
		System.out.println(t1.a + "  "+t1.b);
	}
}

class Test implements Cloneable{

	int a;
	int b;
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

	public Object clone() throws
	CloneNotSupportedException
	{
		return super.clone();
	}
}


