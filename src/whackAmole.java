import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAmole implements ActionListener, MouseListener {
	private JButton o = new JButton();
	private JButton tw = new JButton();
	private JButton th = new JButton();
	private JButton fo = new JButton();
	private JButton fi = new JButton();
	private JButton si = new JButton();
	private JButton se = new JButton();
	private JButton e = new JButton();
	private JButton ni = new JButton();
	private JButton te = new JButton();
	private JButton o1 = new JButton();
	private JButton tw1 = new JButton();
	private JButton th1 = new JButton();
	private JButton fo1 = new JButton();
	private JButton fi1 = new JButton();
	private JButton si1 = new JButton();
	private JButton se1 = new JButton();
	private JButton e1 = new JButton();
	private JButton ni1 = new JButton();
	private JButton te1 = new JButton();
	private JButton o2 = new JButton();
	private JButton tw2 = new JButton();
	private JButton th2 = new JButton();
	private JButton fo2 = new JButton();

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(300, 1000);
		panel.add(o);
		panel.add(tw);
		panel.add(th);
		panel.add(fo);
		panel.add(fi);
		panel.add(si);
		panel.add(se);
		panel.add(e);
		panel.add(ni);
		panel.add(te);
		panel.add(o1);
		panel.add(tw1);
		panel.add(th1);
		panel.add(fo1);
		panel.add(fi1);
		panel.add(si1);
		panel.add(se1);
		panel.add(e1);
		panel.add(ni1);
		panel.add(te1);
		o.addMouseListener(this);
		tw.addMouseListener(this);
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

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