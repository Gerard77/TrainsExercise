package trains;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exception.IncorrectFileFormatException;

public class Main {
	// main method of the program
	public static void main(String[] args) throws IOException {
		String inp = "";
		Route route = new Route();
		ArrayList<Graph> list = null;		
		Scanner in = new Scanner(System.in);
		try {
			//Graph file reading and control of possible Exceptions
			list = route.readFile();
		} catch (IncorrectFileFormatException e) {
			e.printStackTrace();
			in.close();
			System.exit(0);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			in.close();
			System.exit(0);
		}
		do {
			do {
				//Ask user for the desired route
				System.out.print("Enter Route: ");
				inp = in.next();
			} while (!validateInput(inp));
			System.out.println(route.findRoute(list, inp) + "\n");

		} while (true);
	}

	// User input validation
	private static boolean validateInput(String input) {
		for (int i = 0; i < input.length(); i++) {
			if ((i % 2 == 0 && !Character.isUpperCase(input.charAt(i)) || (i % 2 != 0 && input.charAt(i) != '-'))) {
				System.out.println("Incorrect input format (examples: A-B, A-C-D, A-D-B-A) \n");
				return false;
			}
		}
		return true;
	}
}
