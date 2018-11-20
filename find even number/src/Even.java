import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int num=0,i=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter Any Number N :");
		int temp=n.nextInt();
		for(i=1;i<=temp;i++)
		{
			if(i%2==0)
			System.out.print(i+"        ");	
		}
			System.out.println();
		
	}

}
