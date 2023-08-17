import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("The first name and last name  ");
		String a=scan.next();
		String b=scan.next();
		System.out.println(joinStrings(a,b));
	}
	public static String joinStrings(String str1,String str2) {
		return str1+str2;
	}

}
