import java.util.Scanner;


class ConsoleScatterData2dReceiver extends ConsoleDataReceiver {

	Graph g;
	
	ConsoleScatterData2dReceiver(Graph g) {
		this.g = g;
		receiveData();
	}

	public void displayMenu() {}

	public void receiveData() {
		@SuppressWarnings("resource")
		Scanner scanInput = new Scanner(System.in);
		System.out.println("What is the title of the graph?");
		g.title = scanInput.nextLine();
		System.out.println("What is the title of the X-Axis?");
		g.axis1Label = scanInput.nextLine();
		System.out.println("What is the title of the Y-Axis?");
		g.axis2Label = scanInput.nextLine();
		
		String s = "";
		while (!s.equalsIgnoreCase("stop")) {
			DataPair dp = new DataPair();
			System.out.println("Insert x-value. (Type stop when done).");
			s = scanInput.nextLine();
			if (s.equalsIgnoreCase("stop"))
				break;
			dp.axis1Value = s;
			System.out.println("Insert corresponding y-value.");
			dp.axis2Value = scanInput.nextLine();
			g.insertPoint((DataPoint)dp);
		}
	}
}
