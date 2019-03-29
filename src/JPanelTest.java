import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {

    public JPanelTest(){
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));

        JPanel jPanel1 = new JPanel(new GridLayout(1,3,10,10));
        JPanel jPanel2 = new JPanel(new GridLayout(1,2,10,10));
        JPanel jPanel3 = new JPanel(new GridLayout(1,2,10,10));
        JPanel jPanel4 = new JPanel(new GridLayout(2,1,10,10));
        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("2"));
        jPanel1.add(new JButton("3"));
        jPanel2.add(new JButton("4"));
        jPanel2.add(new JButton("5"));
        jPanel3.add(new JButton("6"));
        jPanel3.add(new JButton("7"));
        jPanel4.add(new JButton("8"));
        jPanel4.add(new JButton("9"));
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main (String[] args){
        new JPanelTest();
    }

}
