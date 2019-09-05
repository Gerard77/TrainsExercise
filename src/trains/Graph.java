package trains;

import java.util.Objects;

public class Graph {

	// variables for a node of graph
	private String Source;
	private String Destination;
	private int Cost;

	public Graph() {
	}

	// setting variables in a constructor method
	public Graph(String Source, String Destination, int Cost) {
		this.Source = Source;
		this.Destination = Destination;
		this.Cost = Cost;
	}

	// setter and getter methods for above declared variables
	public String getSource() {
		return Source;
	}

	public void setSource(String Source) {
		this.Source = Source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String Destination) {
		this.Destination = Destination;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int Cost) {
		this.Cost = Cost;
	}

	// to return the string reresentation of a node of graph
	@Override
	public String toString() {
		return Source + "" + Destination + "" + Cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Graph other = (Graph) obj;
		if (!Objects.equals(this.Source, other.Source)) {
			return false;
		}
		if (!Objects.equals(this.Destination, other.Destination)) {
			return false;
		}
		if (this.Cost != other.Cost) {
			return false;
		}
		return true;
	}

}
