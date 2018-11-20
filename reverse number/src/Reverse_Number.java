import java.util.Scanner;

   public class Reverse_Number {
	 
	   public static void main(String[] args) {
        
		   int reversed = 0;
     
		   System.out.println("Enter Any Numbers :");
        
		   Scanner scan=new Scanner(System.in);
           
		   int num=scan.nextInt();
            
		   while(num != 0) {
             
			   int digit = num % 10;
               
			   reversed = reversed * 10 + digit;
                 
			   num/=10;
			   
		   }

        System.out.println("Reversed Number: " + reversed);
        }
	   }
