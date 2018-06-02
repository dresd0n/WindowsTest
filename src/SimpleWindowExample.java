import java.awt.*;

public class SimpleWindowExample extends Frame {
	 
	SimpleWindowExample() {
		Button b = new Button("Button!!");
		
		// setting botton position on screen
		b.setBounds(50,50,50,50);;
		
		// adding button into frame
		add(b);
		
		// Setting Frame width and height
		setSize(500, 300);
		
		// Setting the title of Frame
		setTitle("This is my first AWT example");
		
		// Setting the layout of the Frame
		setLayout(new FlowLayout());
		
		/* By default, the frame is not visible so we
		 * are setting the visibility to true to make it 
		 * visible
		 */
		setVisible(true);
	}
	
	public static void main(String args[]) {
		// Creating the instance of Frame
		SimpleWindowExample fr = new SimpleWindowExample();
	}

}
