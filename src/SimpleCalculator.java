import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	public static void main(String[] args) {

	}
	void buildGUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setTitle("Calculator");
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		button1.setBounds(100, 250, 50, 20);
		button2.setBounds(200, 250, 50, 20);
		button3.setBounds(300, 250, 50, 20);
		button4.setBounds(400, 250, 50, 20);
		button1.setText("add");
		button2.setText("subtract");
		button3.setText("multiply");
		button4.setText("divide");
		JTextField tf1= new JTextField();
		JTextField tf2= new JTextField();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);	
	}
}
