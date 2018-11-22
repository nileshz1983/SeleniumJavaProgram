package Excpetion;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = 10/0;           //This statement throws ArithmeticException
 
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}