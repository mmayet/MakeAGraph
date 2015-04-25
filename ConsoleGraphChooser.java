import java.util.Scanner;


class ConsoleGraphChooser implements GraphChooser {

	@Override
	public Graph elicitChoice() {
		@SuppressWarnings("resource")
		Scanner scanInput = new Scanner(System.in);
		String graphType = scanInput.nextLine();
		//scanInput.close();
		if (graphType.equalsIgnoreCase("BarGraph2d"))
			return new BarGraph2d();
		else if (graphType.equalsIgnoreCase("ScatterGraph2d"))
			return new ScatterGraph2d();
		else if (graphType.equalsIgnoreCase("PieChart2d"))
			return new PieChart2d();
		else {
			System.out.println("Wrong graph type selected.");
			return null;
		}
	}
}