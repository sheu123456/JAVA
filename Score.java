import java.util.Scanner;
public class Score{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	//user input prompt

	System.out.println("Input score(1-100):");
	int score = scanner.nextInt();

	//grade classification
	if(score>=90 && score <=100){
	System.out.println("A");
	} else if(score>=70 && score<80){
	System.out.println("A-");
	}else if(score>=60 && score<70){
	System.out.println("B+");
	}else if(score>=50 && score<60){
	System.out.println("B-");
	}else if(score>=0 && score<50){
	System.out.println("F");
	}else{
	System.out.println("Invalid input");
	}
	
	scanner.close();
	
	
	
	}

}