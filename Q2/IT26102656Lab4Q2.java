import java.util.Scanner;

public class IT26102656Lab4Q2{
	public static void main(String[]args){
		
		double examMarks, labSubmissionMarks, finalMarks;
		int examPercentage, labPercentage;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter exam marks(out of 100): ");
		examMarks = input.nextDouble();
		if (examMarks < 0 || examMarks > 100) {
			System.out.print("Invalid input for marks. Terminating the program");
			return;
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		labSubmissionMarks = input.nextDouble();
		if (labSubmissionMarks < 0 || labSubmissionMarks > 100) {
			System.out.print("Invalid input for lab submission marks. Terminating the program");
			return;
		}
		
		
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage = input.nextInt();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		labPercentage = input.nextInt();
		
		if (examPercentage + labPercentage != 100) {
			System.out.print("The percentage must add up to 100. Terminating program");
			return;
		}
		else{
			finalMarks = (labSubmissionMarks * labPercentage/100) + (examMarks * examPercentage/100);
			System.out.print("Final marks is : "+finalMarks);
		}
	}
}