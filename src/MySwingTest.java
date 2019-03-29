import javax.swing.*;
import java.awt.*;

public class MySwingTest extends JFrame {

    public static void main (String args[]){
        new MySwingTest().CreateJFrame("窗口标题");
    }

    public void CreateJFrame(String title){
        JFrame jFrame = new JFrame(title);
        Container container = jFrame.getContentPane();
        JLabel jLabel = new JLabel("这是一个JFrame窗体");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jLabel);
        container.setBackground(Color.white);
        jFrame.setVisible(true);
        jFrame.setSize(200,150);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
