import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener, MouseListener {
	private JButton jokeButton = new JButton();
	private JButton punchButton = new JButton();

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(200, 75);
		panel.add(jokeButton);
		panel.add(punchButton);
		jokeButton.setText("Joke");
		punchButton.setText("Punch Line");
		jokeButton.addMouseListener(this);
		punchButton.addMouseListener(this);
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "I lost my job at the bank on my very first day, know why?");
		}
		if (e.getSource() == punchButton) {
			JOptionPane.showMessageDialog(null, "A woman asked me to check her balance, so I pushed her over");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
