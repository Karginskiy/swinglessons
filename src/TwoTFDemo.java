import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoTFDemo implements ActionListener {

    JTextField jTextField1;
    JTextField jTextField2;
    JLabel jLabel;

    TwoTFDemo() {

        JFrame jFrame = new JFrame("Use Two Text Fields");

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(240, 120);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jTextField1 = new JTextField(10);
        jTextField2 = new JTextField(10);

        jTextField1.setActionCommand("One");
        jTextField2.setActionCommand("Two");

        jTextField1.addActionListener(this);
        jTextField2.addActionListener(this);

        jFrame.add(jTextField1);
        jFrame.add(jTextField2);

        jLabel = new JLabel("");

        jFrame.add(jLabel);

        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("One")) {
            jLabel.setText("ENTER pressed in jtf1: " + jTextField1.getText());
        } else {
            jLabel.setText("ENTER pressed in jtf2: " + jTextField2.getText());
        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TwoTFDemo();
            }
        });

    }

}
