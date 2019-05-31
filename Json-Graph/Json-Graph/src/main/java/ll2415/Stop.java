package ll2415;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stop {
	
	private String stop_id;
    private double stop_lat;
    private double stop_lon;
    private HashMap<Stop, Edge> edges = new HashMap<Stop, Edge>();
    private String father = new String();
    
    public void addedge(Stop end,double weight) {
		Edge newedge = new Edge(weight, end);
		edges.put(end, newedge);
	}
    
    public HashMap<Stop, Edge> getEdges() {
		return edges;
	}

	public void setEdges(HashMap<Stop, Edge> edges) {
		this.edges = edges;
	}
	
    public void setstop_id(String stop_id) {
         this.stop_id = stop_id;
     }
     public String getstop_id() {
         return stop_id;
     }

    public void setstop_lat(double stop_lat) {
         this.stop_lat = stop_lat;
     }
     public double getstop_lat() {
         return stop_lat;
     }

    public void setstop_lon(double stop_lon) {
         this.stop_lon = stop_lon;
     }
     public double getstop_lon() {
         return stop_lon;
     }

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}
     
}