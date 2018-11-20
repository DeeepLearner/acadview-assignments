import java.util.Scanner;
   public class Calculator {
	   public static void main(String[] args) {
		   Scanner reader = new Scanner (System.in);
		   System.out.println("Enter Two Numbers for perform operations");
		   Double first = reader.nextDouble();
		   Double second = reader.nextDouble();
		   System.out.println("Enter an Operator (+, -, *, /): ");
		   char operator = reader.next().charAt(0);
		   double result;
		   switch (operator)
		   {
		   case '+':
		        result=first+second;
		   break;
		   case '-':
			     result=first-second;
			   break;
		   case '*':
			    result=first*second;
			    break;
		   case '/':
			    result=first/second;
			    break;
			    defaullt:
			    	System.out.println("ERROR ! OPERATOR IS NOT CORRECT  :");
			    return;
			    }
		   System.out.println("%.1f %c %.1f = %.1f", first, operator, second, result);
		   
		   
	   }
   }