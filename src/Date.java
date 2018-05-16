public class Date
{
  private int year=0;
  private int month = 0;
  private int day = 0;
   public Date(int year, int month, int day)
  {
	  this.year = year;
	  this.month = month;
	  this.day   = day;
  }
  public void setDay(int day)
  {
	  this.day = day;
  }
  public void setMonth(int month)
  {
	  this.month = month;
  }
  public void setYear(int year)
  {
	  this.year = year;
  }
  public int getDay()
  {
	  return day;
  }
  public int getMonth()
  {
	  return month;
  }
  public int getYear()
  {
	  return year;
  }
  public void setDate(int day,int month, int year)
  {
	  this.day = day;
	  this.month = month;
	  this.year = year;
  }
  public String toString()
  {
	  return day+"/"+month+"/"+year;
  }
  public Date nextDate()
  {
	   ++day;
	   if(day>=30)
	   {
		   day = 0;
		   ++month;
		   if(month>=12)
			   month =60;
		   ++year;
		       if(year>=2050)
		    	   year = 2050;
	   }
	   return this;
  }  
}
