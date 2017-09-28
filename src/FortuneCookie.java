import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    
    public static void main(String[] args) {
        FortuneCookie cookie = new FortuneCookie();
        cookie.showButton();
    }
    
    public FortuneCookie() {
        frame = new JFrame();
        frame.setSize(300, 100);

        panel = new JPanel();
        frame.add(panel);
        
        button = new JButton();
        button.setText("WOOHOO!");
        panel.add(button);
        
        button.addActionListener(this);
    }
    
    public void showButton() {
        frame.setVisible(true);
    }
    
    public void showFortune() {
        String message;
        switch (new Random().nextInt(5)) {
            case 0:
                message = "You will make a lot of money.";
                break;
            case 1:
                message = "You will have an amazing GPA.";
                break;
            case 2:
                message = "Love is at your doorstep.";
                break;
            case 3:
                message = "Your friends have great respect for you.";
                break;
            default:
                message = "Help, I'm being forced to make insecure people feel better about themselves by making fake fortunes ):";
                break;
        }
        JOptionPane.showMessageDialog(frame, message);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(button)) {
            showFortune();
        }
    }
}


