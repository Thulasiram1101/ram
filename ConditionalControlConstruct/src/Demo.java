import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		Check check=new Check();
		check.checkEligibility(marks);
		 
	}

}
