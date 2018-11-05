import java.util.Scanner;
public class FractionCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter the numerator: ");
		String numStr = user.nextLine();
		double num = Double.parseDouble(numStr);
		System.out.print("\nPlease enter the denominator: ");
		String denStr = user.nextLine();
		double den = Double.parseDouble(denStr);
		if(den != 0)
			System.out.print("\nThe fraction is: " + num + "/" + den);
		else
			System.out.print("\nCannot divide by zero");	
			


	}

}
