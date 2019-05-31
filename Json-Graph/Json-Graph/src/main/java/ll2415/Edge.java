package ll2415;

public class Edge {
	private double weight;
	private Stop endvertex;
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Stop getEndvertex() {
		return endvertex;
	}

	public void setEndvertex(Stop endvertex) {
		this.endvertex = endvertex;
	}

	Edge(double w,Stop end) {
		weight=w;
		endvertex=end;
	}
}