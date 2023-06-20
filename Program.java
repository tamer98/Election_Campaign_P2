
import java.util.Scanner;



public class Program{
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Management m = new Management();
		int choice;
		do {
			choice = UserInterface.getChoice(scan);
			switch (choice) {
			case 1:
				break;
			case 2:
				UserInterface.addCitizen(scan, m);
				break;
			case 3:
				UserInterface.addParty(scan, m);
				break;
			case 4:
				UserInterface.addContender(scan, m);
				break;
			case 5:
				UserInterface.showBallotResults(m);
				break;
			case 6:
				UserInterface.showCitizens(m);
				break;
			case 7:
				UserInterface.showParties(m);
				break;
			case 8:
				UserInterface.CreateNewElection(scan,m);
				break;
			case 9:
				UserInterface.showLastresults(m, scan);
				break;
			case 10:
				System.out.println("Bye Bye");
				break;
			default:
				System.out.println("Invalid choice, please try again");
				break;
			}
		} while (choice != 10);
		scan.close();
	}
}