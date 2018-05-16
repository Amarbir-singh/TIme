import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Control implements Runnable
{
	static BufferedReader in ;  static int quit=0;
    
    public void run()
    {
        String msg = null;
        while(true)
        {
            try{
            msg=in.readLine();
            }catch(Exception e){}
             
            if(msg.equals("q")) {quit=1;break;}
        }
    }
    public static void main(String args[]) throws Exception
    {
        Scanner scanner =new Scanner(System.in);
    	in=new BufferedReader(new InputStreamReader(System.in));
         
        Thread t1=new Thread(new Control());
        t1.start();
         
        System.out.println("press q THEN ENTER to terminate");
        Time t2 = new Time(59,45,9);
         int year;
         int month;
         int day;
         System.out.print("Enter the year  ");
         year = scanner.nextInt();
        System.out.print("Enter the month  ");
         month = scanner.nextInt();
        System.out.print("Enter the day  ");
        day = scanner.nextInt();
        Date d1 = new Date(year, month, day);
        System.out.println(d1.toString());
        while(true){
            TimeUnit.SECONDS.sleep(1);
            if(quit==1) break;
            
            System.out.println(t2.nextSecond());
            for(int i=0;i<9;i++)
            {
            	System.out.println();
            }
          
        }
        scanner.close();
    }  
}
