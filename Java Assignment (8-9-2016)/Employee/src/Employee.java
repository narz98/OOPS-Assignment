import java.util.Scanner;
public class Employee {
		public	String fname,lname;
		public  double salary; 
		public Employee()
		{
			salary=0;
			fname=" ";
			lname=" ";
		}
		public Employee(String f,String l,int s)
		{
			salary=s;
			fname=f;
			lname=l;
		}
		Scanner input=new Scanner(System.in);
		public void setname()
		{
			System.out.println("Enter the first name");
			fname=input.nextLine();
		}
		public String getname()
		{
			return fname;
		}
		public void setname1()
		{
			System.out.println("Enter the second name");
			lname=input.nextLine();
		}
		public String getname1()
		{
			return lname;
		}
		public void setsalary()
		{	double temp;
			System.out.println("Enter the salary");
			temp=input.nextDouble();
			if(temp>0)
			salary=temp;
		}
		public Double getsalary()
		{
			return salary;
		}
		public void display()
		{
			System.out.println("First name"+fname);
			System.out.println("Second name"+lname);
			System.out.println("Salary is"+salary);
		}
		public void update()
		{
			salary=salary*0.1;
			System.out.println("Updated salary is"+salary);
		}
		public static void main(String args[]){
			Employee e1=new Employee("James","Bond",20000);
			Employee e2=new Employee();
			e1.display();
			e1.update();
			e2.setname();
			e2.getname();
			e2.setname1();
			e2.getname1();
			e2.setsalary();
			e2.getsalary();
			e2.display();
			e2.update();
			
		}
}

