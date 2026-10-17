import java.util.Scanner;

public class IT26102656Lab4Q1{
	public static void main(String[]args){
		
		int number;
		String message;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number = input.nextInt();
		
		if (number < 0){
			message = "Negative";
		}
		else if (number > 0){
			message = "Positive";
		}
		else{
			message = "Zero";
		}
		System.out.print("The number is: "+ message);
	}
}