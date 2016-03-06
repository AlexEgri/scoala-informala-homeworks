import java.util.Scanner;
public class UserInput {

public void userChoice{

	Scanner user_input = new Scanner(System.in);
	System.out.println("Choose the operation: a | b | c");
	String chosenOption = user_input.next();

	switch(chosenOption){
	case "a":
	System.out.println("Adding Books");
	break;
	case "b":
	System.out.println("Removing Books");
	break;
	case "c":
	System.out.println("Listing Books");
	break;
	default:
	System.out.println("No valid choice");
	break;
	}
}


}