import java.util.Scanner;

public class Prime_Number 
  { 
	public static void main(String a[])
	 {   
		int temp;
		Scanner s=new Scanner(System.in); 
				System.out.println("Enter any Number to know it is pirme or not");
		int num=s.nextInt();
		s.close();
		boolean flag=false;
		for (int i=2; i<=num/2; i++)
		{
			if(num % i == 0)
			{
				flag=true;
				break;
			}
		}
		if (!flag)
		
			System.out.println("The given Number "+num+" is prime number");
			else
				System.out.println("The given Number "+num+" is non prime number");
			}
		}



