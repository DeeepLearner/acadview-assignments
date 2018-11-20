import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class Find_Armstrong_Number
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whether it is Armstrong or Not :");
		int num=scan.nextInt();
		int leng=0;
		int t1=num;
		while (t1!=0)
		{
			t1=t1/10;
			leng=leng+1;
		}
	//System.out.println(leng);

		int rem;
		int t2=num;
		int arm=0;
		while(t2!=0)
		{
			int mul=1;
		for(int i=1;i<=leng;i++)
		{
		  rem=t2%10;
		  mul=mul*rem;
		}
          arm=arm+mul;
          t2=t2/10;
	}
		if(arm==num)
		{	
			System.out.println("The Entered Number is Armstrong -");
		}
			else
			{
				System.out.println("The Entered Numberc is NOT Armstrong -");
			}
			}
}