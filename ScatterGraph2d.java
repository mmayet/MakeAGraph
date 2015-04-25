import java.util.ArrayList;
import java.util.List;

class ScatterGraph2d extends Graph {
	
	List<DataPoint> data;
	
	ScatterGraph2d() {
		data = new ArrayList<DataPoint>();
	}

	public void insertPoint (DataPoint point) {
		data.add(point);
	}

	public List<DataPoint> getData() {return data;}
	
	public String getType () {return "ScatterGraph2d";}
}
