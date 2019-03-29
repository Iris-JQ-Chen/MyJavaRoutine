import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {

    public JScrollPaneTest(){
        Container container = getContentPane();
        JTextArea jTextArea = new JTextArea(20,50);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane);
        setTitle("带滚动条的文字编译器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main (String[] args){
        new JScrollPaneTest();
    }

}
