import java.util.Scanner;

public class Reverse_Any_Number {
	
	public static void main(String[] args) {
		
		int reversed=0;
		
		System.out.println("Enter the Number to find its Reverse Pattern -");
		
		Scanner scan=new Scanner(System.in);

		int num=scan.nextInt();
		
		while(num != 0) {
			
			int digit = num % 10 ;
			
			reversed = reversed * 10 + digit;
			
			num/=10;
         
		 }
		
		System.out.println("The Reverse Series of Entered Number is : "+reversed);
		}
	   }