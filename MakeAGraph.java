import java.util.ArrayList;
import java.util.List;

class MakeAGraph {

	WelcomeScreen welcome;
	static GraphDriver driver;
	static List<String> availableGraphTypes;

	public static void main(String[] args) {
		availableGraphTypes = new ArrayList<String>();
		availableGraphTypes.add("BarGraph2d");
		availableGraphTypes.add("ScatterGraph2d");
		availableGraphTypes.add("PieChart2d");
		
		System.out.println("These are the available graphs to choose from: " 
				+ availableGraphTypes.get(0) + ", " 
				+ availableGraphTypes.get(1) + ", "
				+ availableGraphTypes.get(2) +
				". Please type the type of graph you would like: ");
		
		driver = new GraphDriver("console", "console", "console");
	}

}
