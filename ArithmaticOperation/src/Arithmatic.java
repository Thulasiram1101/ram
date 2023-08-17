import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumber(num1,num2));
		System.out.println("Enter two numbers");
		num1=scan.nextInt();
	    num2=scan.nextInt();
		System.out.println(multiplyNumber(num1,num2));
		System.out.println("Enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(divideNumber(num1,num2));
		System.out.println("Enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(RemainderNumber(num1,num2));
		

	}
	public static int subtractNumber(int num1,int num2) {
		return num1-num2;
	}
	public static int multiplyNumber(int num1,int num2) {
		return num1*num2;
	}
	public static double divideNumber(int num1,int num2) {
		return num1/num2;
	}
	public static int RemainderNumber(int num1,int num2) {
		return num1%num2;
	}

}
