import java.util.Scanner;
import java.lang.Math;

public class greatest {
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("Enter three numbers: ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if((a>=b)&&(a>=c)) {
			System.out.println(a+" is greatest");
		}
		else if((b>=a)&&(b>=c)) {
			System.out.println(b+" is greatest");
		}
		else if((c>=a)&&(c>=b)) {
			System.out.println(c+" is greatest");
		}

		

	}
}
