import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo implements ActionListener {

    JTextField jTextField;
    JLabel jLabel;

    JTextFieldDemo() {

        JFrame frame = new JFrame("A textfield example");
        frame.setLayout(new FlowLayout());
        frame.setSize(240, 90);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jTextField = new JTextField(10);
        jTextField.addActionListener(this);
        frame.add(jTextField);
        jLabel = new JLabel("");
        frame.add(jLabel);
        frame.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("Current contents: " + jTextField.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
}
