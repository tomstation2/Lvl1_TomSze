import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetTweet implements MouseListener {

	private JButton search = new JButton();
	private JTextField searchTerm = new JTextField();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Dimension d = new Dimension(150,35);
	 void buildGUI() {
		frame.setBounds(100, 100, 300, 75);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Get Updated Tweets Here");
		panel.add(searchTerm);
		panel.add(search);
		search.setText("Search Twitter");
		search.addMouseListener(this);
		searchTerm.setPreferredSize(d);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tweet tweet");
		private String getLatestTweet(String searchingFor) {

			Twitter twitter = new TwitterFactory().getInstance();
			AccessToken accessToken = new AccessToken(
					"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
					"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
			twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
					"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
			twitter.setOAuthAccessToken(accessToken);

			Query query = new Query(searchingFor);
			try {
				QueryResult result = twitter.search(query);
				return result.getTweets().get(0).getText();
			} catch (Exception e) {
				System.err.print(e.getMessage());
				return "What the heck is that?";
			}
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
