import java.util.Scanner;

public class IT26102656Lab4Q3{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		String message = (number<0) ? "Negative":
						 (number>0) ? "Positive": "Zero";
		System.out.print("The number is: "+message);
		
	}
}