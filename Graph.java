import java.util.List;


abstract class Graph {

	String title;
	String axis1Label;
	String axis2Label;
	List<DataPoint> data;

	public void insertPoint (DataPoint point) {}

	public List<DataPoint> getData() {return null;}

	public String getType() {return null;}

}
