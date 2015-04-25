import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;



class GUIGraphVisualizer implements GraphVisualizer {

	public void setup(){}

	public void drawGraph(JFreeChart chart, Graph g) {
		ChartFrame frame = new ChartFrame(g.title, chart);
		frame.pack();
		frame.setVisible(true);
	}

	public void saveGraph(JFreeChart chart, Graph g) {}

	public void drawGraph() {}
}
