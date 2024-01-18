import java.util.*;

public class BasicCalculator{

	public static void main(String [] args){
	Scanner scanner= new Scanner(System.in);


	//user input
	System.out.println("Enter first no.: ");
	double no1 = scanner.nextDouble();

	System.out.println("Enter two no.: ");
	double no2 = scanner.nextDouble();
	
	System.out.println("Choose operation(*,/,+,-): ");
	String ops = scanner.next();

	//Switch case

	switch (ops) {
		case "*":
		System.out.println("Result: " + (no1 * no2));
		break;
	
		case "+":
		System.out.println("Result: " + (no1 + no2));
		break;
	
		case "-":
		System.out.println("Result: " + (no1 - no2));
		break;

		case "/":
		if(no2 !=0){
		System.out.println("Result: " + (no1 / no2));
		}
		else{
		System.out.println("Syntax error");
		}
		break;
		default:
		System.out.println("Please enter an operation. ");
	}

	scanner.close();

	}

}