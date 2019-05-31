package ll2415;

public class Stop_Edge {
	Stop stop = new Stop();
	double distance = new Double(0);
	public Stop_Edge (Stop stop,Double distance) 
	{
		this.stop = stop;
		this.distance = distance;
	}
	
	public Stop getStop() {
		return stop;
	}
	public void setStop(Stop stop) {
		this.stop = stop;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
