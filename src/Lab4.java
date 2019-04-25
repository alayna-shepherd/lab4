import java.util.Scanner;

public class Lab4 {
	
	public static void main(String[] args) {
	
		// put out prompts
				System.out.println("Learn your squares and cubes!");
				System.out.println();
				System.out.println("Enter an integer: ");

				// get my user number
				Scanner numScan = new Scanner(System.in);
				int userNum = numScan.nextInt();
				System.out.println("Enter an integer: ");
				
				//do math under the headings
			String cont;
			do {	System.out.println("Number: " + "     " + "Squared: " + "     "+ "Cubed: " + "     ");
				System.out.println("=======" + "     " + "======== " + "     " + "======== ");
				System.out.print(userNum + "     "  + "     " + "     " );
				System.out.print(userNum * userNum  + "     "  + "     " + "     " );
				System.out.println(userNum * userNum * userNum);
	
				System.out.println("continue? (y/n)");
				Scanner user = new Scanner(System.in);
				cont = user.next();
			} while (cont.equalsIgnoreCase("Y"));
				
	
	
	
	
	
	
	
	
	numScan.close();
	
	
	
	
	
}
}


