import java.time.*;
import java.util.Scanner;
public class time{
    public static  boolean check(int hours,int minutes,int seconds) {
        boolean value = false;
        if(hours<60&&hours>=0&&minutes<60&&minutes>=0&&seconds<60&&seconds>=0)
        {
            value=true;
        }
        return value;
    }
    /**
     * @param input
     * @return
     */
    public static int[] getUserInput() {
        Scanner sc=new Scanner(System.in);
        int [] array1 = new int[3];
        System.out.println("enter Hours");
        int userinput_hours=sc.nextInt();
        System.out.println("enter Minutes");
        int userinput_minutes=sc.nextInt();
        System.out.println("enter Seconds");
        int userinput_seconds=sc.nextInt(); 
        if(check(userinput_hours,userinput_minutes,userinput_seconds))       
        {
            array1[0]=userinput_hours;
            array1[1]=userinput_minutes;
            array1[2]=userinput_seconds;
        }
        else{
            System.out.println("Enter valid Time");
            getUserInput();
        }
        return array1;
    }
    public static void main(String [] args)
    {
        
        int []time_Array=getUserInput();
        boolean value=true;        
        while(value)
        {
        LocalTime Currenttime=LocalTime.now();
        int hours=Currenttime.getHour();
        int minutes=Currenttime.getMinute();
        int seconds=Currenttime.getSecond();
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("error");
        }
        System.out.println(hours+":"+minutes+":"+seconds);
        if(hours==time_Array[0]&&minutes==time_Array[1]&&seconds==time_Array[2])
        {
            value=false;
        }
            
        }
    }
        
}