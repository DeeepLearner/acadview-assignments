import java.util.Scanner;
public class NewClass {
	public static void main(String args[])
	{
		int x,y,z;
		System.out.println("Enter Two Numbers to Calculate Their Sum =");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("The Sum of Two Integers =" + z);
		
	}

}
