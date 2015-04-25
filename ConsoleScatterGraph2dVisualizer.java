import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;



//import javax.swing.JPanel;


class ConsoleScatterGraph2dVisualizer extends ConsoleGraphVisualizer {
	
	ScatterGraph2d g;
	XYSeries series;
	
	ConsoleScatterGraph2dVisualizer(Graph g) {
		this.g = (ScatterGraph2d) g;
		series = new XYSeries("");
		
		setup();
		
	}

	public void setup() {
		for(int i = 0; i < g.getData().size(); i++) {
            series.add(Integer.valueOf(g.getData().get(i).getAxis1Value()), Integer.valueOf(g.getData().get(i).getAxis2Value()));
        }
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		drawGraph(dataset);
	}

	public void drawGraph(XYSeriesCollection dataset) {
		JFreeChart chart = ChartFactory.createScatterPlot(g.title, g.axis1Label, g.axis2Label, (XYDataset) dataset, PlotOrientation.VERTICAL,
				 false, false, false );
		saveGraph(chart, g);
	}
	
}
