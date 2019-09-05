package trains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import exception.IncorrectFileFormatException;

public class Route {

	public ArrayList<Graph> readFile() throws IOException, IncorrectFileFormatException, FileNotFoundException {
		// array list of graph nodes
		ArrayList<Graph> graph = new ArrayList<>();
		Graph node = null;
		// read the text input file line by line
		BufferedReader br = new BufferedReader(new FileReader("Graph.txt"));
		String line = "";
		// We'll use this in case there's a format error in the Graph File
		int fileLineNumber = 1;
		// reading the file
		while ((line = br.readLine()) != null) {
			// String[] rec = line.split("");
			String[] rec = splitFileLine(line, fileLineNumber);
			// create a new node for each item
			node = new Graph(rec[0], rec[1], Integer.parseInt(rec[2]));
			// add it to the graph list
			graph.add(node);
			fileLineNumber++;
		}
		br.close();
		return graph;
	}

	public String findRoute(ArrayList<Graph> graph, String route) {

		String[] nodes = route.split("-");

		int sum = 0;
		boolean found = false;
		// loops to find out the routes and calculate the cost between them
		for (int a = 0; a < nodes.length - 1; a++) {
			found = false;
			String src = nodes[a];
			String dest = nodes[a + 1];
			for (int b = 0; b < graph.size(); b++) {
				// match source & destination with the gaph nodes
				if (src.equals(graph.get(b).getSource()) && dest.equals(graph.get(b).getDestination())) {
					sum += graph.get(b).getCost(); // if matched, add the cost to 'sum'
					found = true;
				}
			}
			// if route is broken somewhere, exit the loop and print the message that NO
			// SUCH ROUTE
			if (found == false) {
				sum = 0;
				break;
			}
		}
		if (found)
			return sum + "";
		else
			return "NO SUCH ROUTE";
	}

	private static String[] splitFileLine(String line, int fileLineNumber) throws IncorrectFileFormatException {
		String[] splittedLine = new String[3];
		if (line.length() < 3 || !Character.isUpperCase(line.charAt(0)) || !Character.isUpperCase(line.charAt(1))) {
			throw new IncorrectFileFormatException(fileLineNumber);
		}
		splittedLine[0] = line.substring(0, 1);
		splittedLine[1] = line.substring(1, 2);
		splittedLine[2] = line.substring(2, line.length());

		if (!splittedLine[2].matches("(0|[1-9]\\d*)")) {
			throw new IncorrectFileFormatException(fileLineNumber);
		} else {
			return splittedLine;
		}
	}
}