import javax.swing.*;

public class SwingDemo {

    private SwingDemo() {

        JFrame jfrm = new JFrame("A Simple Swing program");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Swing powers the modern Java GUI.");
        jfrm.getContentPane().add(jLabel);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });

    }

}
