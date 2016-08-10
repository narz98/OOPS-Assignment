import java.util.Scanner;
public class Duplicate {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int []a=new int[5];
		int i,n;
		System.out.println("Enter first element");
		a[0]=input.nextInt();
		System.out.println(a[0]);
		System.out.println("Enter Second element");
		a[1]=input.nextInt();
		if(a[1]!=a[0])
		{
			System.out.println(a[1]);
		}
		System.out.println("Enter third element");
		a[2]=input.nextInt();
		if(a[2]!=a[0]&&a[2]!=a[1])
		{
			System.out.println(a[2]);
		}
		System.out.println("Enter fourth element");
		a[3]=input.nextInt();
		if(a[3]!=a[0]&&a[3]!=a[1]&&a[3]!=a[2])
		{
			System.out.println(a[3]);
		}
		System.out.println("Enter fifth element");
		a[4]=input.nextInt();
		if(a[4]!=a[0]&&a[4]!=a[1]&&a[4]!=a[2]&&a[4]!=a[3])
		{
			System.out.println(a[4]);
		}
	}

}
