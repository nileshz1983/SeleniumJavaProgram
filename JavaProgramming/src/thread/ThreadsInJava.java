package thread;

class MyThread implements Runnable
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 2; i++)
        {
            //System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        	try {
				
				System.out.println("hi");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
    }
}
class MyThread2 implements Runnable
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 2; i++)
        {
            //System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        	try {
				
				System.out.println("hi]ello");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
    }
}
 
public class ThreadsInJava
{
    //Main Thread
    public static void main(String[] args) throws InterruptedException
    {
    	MyThread myThread = new MyThread();
    	MyThread2 myThread2 = new MyThread2(); //instantiating your thread class that implements Runnable interface
 
        Thread t = new Thread(myThread); 
      
        Thread t2 = new Thread(myThread2);//Creating an object to Thread class by passing your thread as an argument
 
       // t.start(); 
        Thread.sleep(100);
       t.run();
        //t2.start(); //Starting the thread
    }
}