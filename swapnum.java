import java.util.Scanner;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number a: ");
		a=scan.nextInt();
		System.out.print("Enter number b: ");
		b=scan.nextInt();
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("New number a: " +a);
		System.out.println("New number b: " +b);
	}

}
