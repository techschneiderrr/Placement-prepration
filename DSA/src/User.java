import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		int net;
		for (int i=0;i<n;i++)
		{
			int q = myObj.nextInt();
			int p = myObj.nextInt();
			if (q>1000)
			{
				net = p*q;
				net = net-(net/10);
				System.out.println(net);
			}
			else
			{
				net = p*q;
				System.out.println(net);
			}
			
		}
		
	}
}
