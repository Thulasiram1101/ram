import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a score");
		int score=scan.nextInt();
		Grade grade=new Grade();
		grade.givingGrade(score);
	}

}
