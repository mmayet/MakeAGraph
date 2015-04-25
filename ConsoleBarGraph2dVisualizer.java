import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


class ConsoleBarGraph2dVisualizer extends ConsoleGraphVisualizer {
	
	BarGraph2d g;
	DefaultCategoryDataset dataset;

	ConsoleBarGraph2dVisualizer(Graph g) {
		this.g = (BarGraph2d) g;
		dataset = new DefaultCategoryDataset();
		
		setup();
	}
	
	public void setup() {
		for(int i = 0; i < g.getData().size(); i++) {
            dataset.setValue(Integer.valueOf(g.getData().get(i).getAxis2Value()), g.axis2Label,g.getData().get(i).getAxis1Value());
        }
		
		if (this.g.standardOrientation)
			drawGraph(PlotOrientation.VERTICAL);
		else
			drawGraph(PlotOrientation.HORIZONTAL);
	}
	
	private void drawGraph(PlotOrientation p) {
		JFreeChart chart = ChartFactory.createBarChart(g.title, g.axis1Label, g.axis2Label, dataset, p, false, false, false);
		saveGraph(chart, g);
	}
	
}
