
class GraphDriver {

	GraphChooser chooser;
	Graph selectedGraph;
	DataReceiver receiver;
	GraphVisualizer visualizer;

	GraphDriver(String chooserSource, String dataSource, String visualizerDestination) {
		if (chooserSource == "console" && dataSource == "console" && visualizerDestination == "console")
			runCCC();
	}

	public void runCCC() {
		chooser = new ConsoleGraphChooser();
		selectedGraph = chooser.elicitChoice();
		
		if (selectedGraph.getType().equals("BarGraph2d")) {
			receiver = new ConsoleBarData2dReceiver(selectedGraph);
			visualizer = new ConsoleBarGraph2dVisualizer(selectedGraph);
			System.out.println("BarGraph2d Created.");
		}
		else if (selectedGraph.getType().equals("ScatterGraph2d")) {
			receiver = new ConsoleScatterData2dReceiver(selectedGraph);
			visualizer = new ConsoleScatterGraph2dVisualizer(selectedGraph);
			System.out.println("ScatterGraph2d Created.");
		}
		else if (selectedGraph.getType().equals("PieChart2d")) {
			receiver = new ConsolePieChartData2dReceiver(selectedGraph);
			visualizer = new GUIPieChart2dVisualizer(selectedGraph);
			System.out.println("PieChart2d Created.");
		}
	}
}

