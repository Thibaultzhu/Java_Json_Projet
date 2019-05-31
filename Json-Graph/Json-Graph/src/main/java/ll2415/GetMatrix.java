package ll2415;

import java.util.List;

public class GetMatrix {
	private List<Object> myObjects_transfer;
	private List<Object> myObjects_stop;
	private graph gra;
	
	GetMatrix(List a,List b){
		this.myObjects_transfer=a;
		this.myObjects_stop=b;
		setGra(new graph(b));
		Transfer_Create();
	}
	
	
	void Transfer_Create(){
		for(Object get:myObjects_transfer){
			String start=((Transfer) get).getfrom_stop_id();
			String to=((Transfer) get).getto_stop_id();
			getGra().addedge(start,to);
		}
	}

	public graph getGra() {
		return gra;
	}

	public void setGra(graph gra) {
		this.gra = gra;
	}
}