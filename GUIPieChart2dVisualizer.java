import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

//import javax.swing.JPanel;


class GUIPieChart2dVisualizer extends GUIGraphVisualizer {
	
	PieChart2d g;
	DefaultPieDataset dataset;
	
	GUIPieChart2dVisualizer(Graph g) {
		this.g = (PieChart2d) g;
		dataset = new DefaultPieDataset();
		
		setup();
	}

	public void setup() {
		for(int i = 0; i < g.getData().size(); i++) {
            dataset.setValue(g.getData().get(i).getAxis1Value(), Integer.valueOf(g.getData().get(i).getAxis2Value()));
        }
		
		JFreeChart chart = ChartFactory.createPieChart(g.title, dataset);
		drawGraph(chart, g);
	}
	
}
