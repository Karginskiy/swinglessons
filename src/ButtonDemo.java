import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {

    JLabel jLabel;

    ButtonDemo() {

        JFrame jFrame = new JFrame("A Button Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(220, 90);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jButton = new JButton("First");
        JButton jButton1 = new JButton("Second");
        jButton.addActionListener(this);
        jButton1.addActionListener(this);

        jFrame.add(jButton);
        jFrame.add(jButton1);

        jLabel = new JLabel("Press a button.");

        jFrame.add(jLabel);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getActionCommand().equals("First")) {
            jLabel.setText("First button was pressed");
        } else {
            jLabel.setText("Second button was pressed");
        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });

    }

}
