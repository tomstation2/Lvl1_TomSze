import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SimpleCalculator implements ActionListener,MouseListener{
private	JButton addButton = new JButton();
private	JButton subButton = new JButton();
private	JButton multButton = new JButton();
private	JButton divButton = new JButton();
JTextField tf1= new JTextField();
JTextField tf2= new JTextField();
JLabel ans=new JLabel();
	 void buildGUI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setTitle("Calculator");
		addButton.setBounds(100, 150, 50, 20);
		subButton.setBounds(200, 150, 50, 20);
		multButton.setBounds(300, 150, 50, 20);
		divButton.setBounds(400, 150, 50, 20);
		addButton.setText("add");
		subButton.setText("subtract");
		multButton.setText("multiply");
		divButton.setText("divide");
		addButton.addMouseListener(this);
		subButton.addMouseListener(this);
		multButton.addMouseListener(this);
		divButton.addMouseListener(this);
		tf1.setText("0");
		tf2.setText("0");
		tf1.setBounds(200, 450, 200, 20);
		tf2.setBounds(300, 450, 200, 20);
		ans.setText("0");
		panel.add(tf1);
		panel.add(tf2);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(multButton);
		panel.add(divButton);	
		panel.add(ans);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("click");	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("press");
		int number1=Integer.parseInt(tf1.getText());
		int number2=Integer.parseInt(tf2.getText());
		if(e.getSource()==addButton) {
			ans.setText(Integer.toString(number1+number2));
		}
		if(e.getSource()==subButton) {
			ans.setText(Integer.toString(number1-number2));
		}
		if(e.getSource()==multButton) {
			ans.setText(Integer.toString(number1*number2));
		}
		if(e.getSource()==divButton) {
			ans.setText(String.valueOf((number1/number2)));
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
