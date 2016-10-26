import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class StopWatch implements ActionListener{

    JLabel jLabel;
    long start;

    StopWatch() {

        JFrame frame = new JFrame("A Simple Stopwatch");
        frame.setLayout(new FlowLayout());
        frame.setSize(230, 90);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Start");
        JButton jButton1 = new JButton("Stop");

        jButton.addActionListener(this);
        jButton1.addActionListener(this);

        frame.add(jButton);
        frame.add(jButton1);

        jLabel = new JLabel("Press Start to begin timing");

        frame.add(jLabel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Calendar cal = Calendar.getInstance();

        if (e.getActionCommand().equals("Start")) {
            start = cal.getTimeInMillis();
            jLabel.setText("Stop watch is Running...");
        } else {
            jLabel.setText("Elapsed time is " + (double) (cal.getTimeInMillis() - start) / 1000);
        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StopWatch();
            }
        });

    }
}
