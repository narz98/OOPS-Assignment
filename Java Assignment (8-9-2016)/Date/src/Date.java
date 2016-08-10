import java.util.Scanner;
public class Date {
		
		public int month,day,year;
		public Date()
		{
			month=0;
			day=0;
			year=0;
		}
		public Date(int m,int d,int y)
		{
			month=m;
			day=d;
			year=y;
		}
		Scanner input=new Scanner(System.in);
		public void setmonth()
		{
			System.out.println("Enter the month");
			month=input.nextInt();
		}
		public int getmonth()
		{
			return month;
		}
		public void setday()
		{
			System.out.println("Enter the day");
			day=input.nextInt();
		}
		public int getday()
		{
			return day;
		}
		public void setyear()
		{
			System.out.println("Enter the year");
			year=input.nextInt();
		}
		public int getyear()
		{
			return year;
		}
		public void displayDate()
		{
			System.out.println(month+"/"+day+"/"+year);
		}
		public static void main(String args[]){
			Date d=new Date();
			d.setmonth();
			d.getmonth();
			d.setday();
			d.getday();
			d.setyear();
			d.getyear();
			d.displayDate();
		}
}
