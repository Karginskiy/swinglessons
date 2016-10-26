import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coder implements ActionListener {

    JTextField jtfPlainText;
    JTextField jtfCipherText;

    Coder () {

        JFrame jFrame = new JFrame("A Simple Code Machine");

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(340, 120);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jLabelPlainText = new JLabel(" Plain Text: ");
        JLabel jLabelCipherText = new JLabel(" Cipher Text: ");

        jtfPlainText = new JTextField(20);
        jtfCipherText = new JTextField(20);

        jtfPlainText.setActionCommand("Encode");
        jtfCipherText.setActionCommand("Decode");

        jtfPlainText.addActionListener(this);
        jtfCipherText.addActionListener(this);

        jFrame.add(jLabelPlainText);
        jFrame.add(jtfPlainText);
        jFrame.add(jLabelCipherText);
        jFrame.add(jtfCipherText);


        JButton jButtonEncode = new JButton("Encode");
        JButton jButtonDecode = new JButton("Decode");
        JButton jButtonReset = new JButton("Reset");

        jButtonEncode.addActionListener(this);
        jButtonDecode.addActionListener(this);
        jButtonReset.addActionListener(this);

        jFrame.add(jButtonEncode);
        jFrame.add(jButtonDecode);
        jFrame.add(jButtonReset);

        jFrame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Encode")) {
            StringBuilder str = new StringBuilder(jtfPlainText.getText());
            for (int i = 0; i < str.length(); i++) {
                str.setCharAt(i, (char) (str.charAt(i) + 1));
            }

            jtfCipherText.setText(str.toString());

        } else if (e.getActionCommand().equals("Decode")) {

            StringBuilder str = new StringBuilder(jtfCipherText.getText());

            for (int i = 0; i < str.length(); i++) {
                str.setCharAt(i, (char) (str.charAt(i) - 1));
            }

            jtfPlainText.setText(str.toString());

        } else {

            jtfPlainText.setText("");
            jtfCipherText.setText("");

        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Coder();
            }
        });

    }
}
