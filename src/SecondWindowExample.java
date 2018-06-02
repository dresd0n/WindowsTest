import java.awt.*;

public class SecondWindowExample {

	public SecondWindowExample() {
		// Creating Frame
		Frame fr = new Frame();
		
		// Creating a label
		Label lb= new Label("UserID: ");
		
		// Adding label to the frame
		fr.add(lb);
		
		// Creating a text field
		TextField t = new TextField();
		
		//Adding text field to the frame
		fr.add(t);
		
		//Setting the frame size
		fr.setSize(500, 300);
		
		// Setting the layout for the Frame
		fr.setLayout(new FlowLayout());
		
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWindowExample ex = new SecondWindowExample();
	}

}
