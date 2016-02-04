
import java.util.Scanner;

public class Aliens {
	// * ALIENS
	public static void main(String[] args) {
		welcomeMsg();
		Scanner input = new Scanner(System.in);

		byte choise = 1;
		do {

			byte testsNumber;
			// * number of tests
			do {
				System.out.println();
				System.out.println("Number of tests (max 40): ");
				testsNumber = input.nextByte();
			} while (testsNumber < 1 || testsNumber > 40);
			// number of tests *

			byte testCount = 1;
			for (int i = 0; i < testsNumber; i++) {
				System.out.println();
				System.out.println("- Test number " + testCount + " -");

				// * word
				String word;
				System.out.println("Enter word (min 2 symbols): ");
				do {
					word = input.nextLine().toLowerCase().replaceAll("\\s", "");
				} while (word.length() < 2);
				// word *

				// * text
				String text;
				System.out.print("Enter text: ");
				do {
					text = input.nextLine().toLowerCase().replaceAll("\\s", "");
				} while (word.length() >= text.length() && text.length() < 10000);
				// text *

				// * print test results
				System.out.println("Test result: ");
				System.out.println(wordPosition(word, text));
				int index = text.indexOf(word);
				while (index != -1) {
					System.out.print(index + " ");
					index = text.indexOf(word, index + 1);
				}
				// print test results *
				System.out.println();
				testCount++;
			}
			// * continue or exit
			continueOrExit();
			choise = input.nextByte();
		} while (choise != 0);
		// continue or exit *
		endMsg();
	}

	// END OF ALIENS *
	//
	///////// Word Count /////////
	public static int wordPosition(String word, String text) {
		int index = text.indexOf(word);
		int count = 0;
		while (index != -1) {
			count++;
			index = text.indexOf(word, index + 1);
		}
		return count;
	}

	/////// Messages //////
	public static void welcomeMsg() {
		System.out.println("            -");
		System.out.println("  -    - -     - -   -  ");
		System.out.println(" - - - A L I E N S - - -");
		System.out.println("    -  -   - -   -  -   ");
		System.out.println("      -           -     ");
	}

	public static void continueOrExit() {
		System.out.print("To continue press \"1\" or \"0\" for exit: ");
	}

	public static void endMsg() {
		System.out.println("      |           |");
		System.out.println("      -           -     ");
		System.out.println("     Have a nice day !");
		System.out.println("      -           -     ");
		System.out.println("      |           |");
	}
}