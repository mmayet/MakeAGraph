import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BarGraph2d extends Graph {

	List<DataPoint> data;
	boolean standardOrientation = true;
	
	BarGraph2d() {
		data = new ArrayList<DataPoint>();
		
		System.out.println("If you want to bar graph to be vertical, enter 'v', if you want it to be horizontal, enter 'h'.");
		@SuppressWarnings("resource")
		Scanner scanInput = new Scanner(System.in);
		String orientation = scanInput.nextLine();
		if (orientation.equalsIgnoreCase("h"))
			standardOrientation = false;
	}

	public void insertPoint (DataPoint point) {
		data.add(point);
	}

	public List<DataPoint> getData() {return data;}

	public String getType () {return "BarGraph2d";}
}
