import javax.swing.*;

public class SwingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);
        frame.setVisible(true);
    }
}
