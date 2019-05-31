package ll2415;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.AbstractMap.SimpleEntry;

public class Dijkstra {
	
	static class PairComparator implements Comparator<Stop_Edge> {
		public int compare(Stop_Edge p1, Stop_Edge p2) {
			int num = ((Double)p1.getDistance()).compareTo(p2.getDistance());
			if(num==0){
            	int num2 = new String((String)p1.getStop().getstop_id()).compareTo((String)p2.getStop().getstop_id());
            	//System.out.println("compare result id:"+num2);
            	return num2;
            }
			return num;
		}
	}
	
	HashSet<String> unvisited = new HashSet<String>();
	TreeSet sort_shortest = new TreeSet<Stop_Edge>(new PairComparator());
    HashMap<String, Double> dis_shortest=new HashMap<String, Double>();

    HashMap<String, Double> final_shortest=new HashMap<String, Double>();
    
	Stop root;
	graph gra;
	String start;
	String last;
	
	public Dijkstra(graph G,String start,String last) {
		gra=G;
		this.last = last;
		this.start = start;
		for(Entry<String, Stop> entry:gra.getAdj().entrySet()) {
			String id=entry.getKey();
			Stop stop=entry.getValue();
			unvisited.add(stop.getstop_id());
			dis_shortest.put(id, Double.MAX_VALUE);
		}//define the space of "unvisited","distance" array according to the vertex number
		//and give them the value in the beginning		
		dis_shortest.remove(start);
		dis_shortest.put(start, 0.0);
		
		root = gra.getAdj().get(start);
		gra.getAdj().get(start).setFather("-1");
		//label the root
		sort_shortest.add(new Stop_Edge(root, 0.0));
		
		System.out.println("Initial complete");
	}
	
	
	public HashMap<String, Double> Dijkstra_shortest(graph G) {
		long startTime = System.currentTimeMillis();
		while (!sort_shortest.isEmpty()) {
			
			for(Object s:sort_shortest)
			{
				System.out.println("Shortest list: "+((Stop_Edge)s).getStop().getstop_id()+" "+((Stop_Edge)s).getDistance());
			}

			Stop_Edge stop_Edge=(Stop_Edge) sort_shortest.pollFirst();
			Stop current_stop=stop_Edge.getStop();
			
			if(unvisited.contains(current_stop.getstop_id()))
			{
				final_shortest.put(current_stop.getstop_id(), dis_shortest.get(current_stop.getstop_id()));
				if (current_stop.getstop_id().compareTo(last)==0) {
					System.out.println("I'm found!");
					break;
				}
				System.out.println("this stop is set : "+current_stop.getstop_id());
				unvisited.remove(current_stop.getstop_id());
				for(Entry<Stop,Edge> entry:current_stop.getEdges().entrySet()) {
					Stop stop_end=entry.getKey();
					Edge edge=entry.getValue();
					String destination = stop_end.getstop_id();
					System.out.println("nearby stop : "+destination+" "+dis_shortest.get(destination));
					if(unvisited.contains(destination))
					{
						double current_distance = dis_shortest.get(destination);
						double new_distance = dis_shortest.get(current_stop.getstop_id())+edge.getWeight();
						System.out.println("it hasn't been visited : "+destination+" "+dis_shortest.get(destination));
						if (new_distance<current_distance )
						{
							Stop_Edge p= new Stop_Edge(stop_end, new_distance);
							sort_shortest.add(p);
							G.getAdj().get(p.getStop().getstop_id()).setFather(current_stop.getstop_id());
							System.out.println("this stop needs to be observerd : "+p.getStop().getstop_id());
							dis_shortest.put(stop_end.getstop_id(),new_distance);
						}
					}
					
						
					}
			}
	
		}
				long endTime = System.currentTimeMillis();
				System.out.println("time cost:"+(endTime-startTime)+"ms");
				//show_shortest();//print the shortest path
				return final_shortest;
				
	}
	
	
	
	
	
	public void show_shortest() {
		System.out.println(root.getstop_id());
		for(Entry<String, Double> entry:final_shortest.entrySet()) {
			String id=entry.getKey();
			double dis=entry.getValue();
			
//			if (dis!=Integer.MAX_VALUE) 
			System.out.println(id+" : "+dis);
		}
	}//show the path	
	
}

