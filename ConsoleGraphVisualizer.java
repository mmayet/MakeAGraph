import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;



class ConsoleGraphVisualizer implements GraphVisualizer {

	public void setup(){}

	public void drawGraph() {}

	public void saveGraph(JFreeChart chart, Graph g) {
		try {
			//If you want to save the graph to another location, edit the following variable:
			String saveTo = "C:\\Users\\Public\\img" + g.getType() + g.title + ".jpg";
			ChartUtilities.saveChartAsJPEG(new File(saveTo), chart, 500, 300);
			System.out.println("Graph saved to " + saveTo);
		} catch (IOException e) {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
}
