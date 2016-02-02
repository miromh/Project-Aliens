
import java.util.Scanner;

public class Aliens {

	public static void main(String[] args) {
		welcomeMsg();

		Scanner input = new Scanner(System.in);

		byte choise = 1;
		do {

			int tmp;

			do {
				System.out.println();
				System.out.println("Number of tests (max 40): ");
				tmp = input.nextInt();
			} while (tmp < 1 || tmp > 40);

			int testCount = 1;

			for (int i = 0; i < tmp; i++) {
				System.out.println();
				System.out.println("- Test number " + testCount + " -");

				String word = "";
				do {
					System.out.print("Enter word (min 2 symbols): ");
					word = input.next().toLowerCase();

				} while (word.length() < 2);

				String text;
				do {
					System.out.print("Enter text: ");
					text = input.next().toLowerCase();

				} while (word.length() >= text.length());

				System.out.println("Test result: ");
				System.out.println(wordPosition(word, text));
				int index = text.indexOf(word);

				while (index != -1) {
					System.out.print(index + " ");
					index = text.indexOf(word, index + 1);
				}
				System.out.println();
				testCount++;

			}
			continueOrExit();
			choise = input.nextByte();
		} while (choise != 0);
		endMsg();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

	/////// Messages ////
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
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
		System.out.println("      -           -     ");
		System.out.println("     Have a nice day !");
		System.out.println("      -           -     ");

	}

}