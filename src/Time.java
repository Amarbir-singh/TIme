
public class Time 
{
   private int second =0;
   private int minute =0;
   private int hour   =0;
   
   public Time()
   {
	   this.second  = 0;
	   this.minute  = 0;
	   this.hour    = 0;
   }
   public Time(int second,int minute, int hour)
   {
	   this.second = second;
	   this.minute = minute;
	   this.hour   = hour;
   }
   public int getHour()
   {
	   return hour;
   }
   public int getMinute()
   {
	   return minute;
   }
   public int getSecond()
   {
	   return second;
   }
   public void setHour(int hour)
   {
	   this.hour = hour;
   }
   public void setMinute(int minute)
   {
	   this.minute = minute;
   }
   public void setSecond(int second)
   {
	   this.second = second;
   }
   public String toString()
   {
	   return hour+":"+minute+":"+second;
   }
   public void setTime(int second, int minute, int hour)
   {
	   this.second = second;
	   this.minute = minute;
	   this.hour   = hour;
   }
   public Time nextSecond()
   {
	   ++second;
	   if(second>=60)
	   {
		   second = 0;
	    ++minute;
		   if(minute>=60)
			   minute =60;
		++hour;
		       if(hour>=24)
		       {
		    	   hour = 0;
		           d1.nextDay();
		       }
	   }
	   return this;
   }
}
