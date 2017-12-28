import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetTweet {
	private JButton search = new JButton();
	private JTextField searchTerm = new JTextField();

	void buildGUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setBounds(100, 100, 300, 75);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Get Updated Tweets Here");
		panel.add(search);
		panel.add(searchTerm);
	}
}
