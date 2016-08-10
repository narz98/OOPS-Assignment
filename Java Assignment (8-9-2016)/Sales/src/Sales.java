import java.util.Scanner;
public class Sales {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int []a=new int[20];
		int []c=new int[9];
		int n,i,sales;
		System.out.println("How many employees?");
		n=input.nextInt();
		System.out.println("Enter the sales value of"+n+"employees");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sales=(200)+(9*a[i])/100;
			 if(sales>=200&&sales<=299)
				 c[0]++;
			else if(sales>=300&&sales<=399)
					c[1]++;
			 else if(sales>=400&&sales<=499)
					c[2]++;
			 else if(sales>=500&&sales<=599)
					c[3]++;
			 else if(sales>=600&&sales<=699)
					c[4]++;
			 else if(sales>=700&&sales<=799)
					c[5]++;
			 else if(sales>=800&&sales<=899)
					c[6]++;
			 else if(sales>=900&&sales<=999)
					c[7]++;
			 else if(sales>1000)
					c[8]++;
		}
			System.out.println("Range"+"		"+"Frequency");
			System.out.println("200-299"+"		"+c[0]);
			System.out.println("300-399"+"		"+c[1]);
			System.out.println("400-499"+"		"+c[2]);
			System.out.println("500-599"+"		"+c[3]);
			System.out.println("600-699"+"		"+c[4]);
			System.out.println("700-799"+"		"+c[5]);
			System.out.println("800-899"+"		"+c[6]);
			System.out.println("900-999"+"		"+c[7]);
			System.out.println("Above 1000"+"      "+c[8]);
	}
}
