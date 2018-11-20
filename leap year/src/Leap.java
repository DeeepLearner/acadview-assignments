import java.util.Scanner;
public class Leap 
{
	public static void main (String args[])
	{
	System.out.println("Enter Any Year : ");
	Scanner s = new Scanner(System.in);
	int year1 = s.nextInt();
	boolean flag=false;
	if(year1  % 400 == 0)
	{
		flag=true;
	}
	else if (year1 % 100 == 0)
	{
		flag=false;
	}
	else if(year1 % 4 == 0)
	{
		flag=true;
	}
	else 
	{
		flag = false;
	}
	if(flag)
	{
		System.out.println("YEAR :"+year1+" is Leap Year");
	}
	else
	{
		System.out.println("YEAR :"+year1+" is not a leap Year");
	}
	}
}
