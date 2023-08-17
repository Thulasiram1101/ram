import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=scan.nextInt();
		System.out.println("weicome to kodnest");
		checkEligibility(marks);

	}
	public static void checkEligibility(int marks) {
		if(marks>=80)
		{
			System.out.println("welcome to techclub");
		}
	}

}
