package javaconceptoftheday;

import java.io.IOException;

public class LaunchingExternalApps
{
    public static void main(String[] args) throws InterruptedException
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
        	Process process =      runtime.exec("notepad F:\\sample.txt");  
            Thread.sleep(5000);
            
            process.destroy();//opens "sample.txt" in notepad
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
