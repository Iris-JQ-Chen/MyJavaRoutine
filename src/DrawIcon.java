import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon {
    private int width;
    private int height;

    public DrawIcon(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    public static void main (String args[]){
        DrawIcon icon = new DrawIcon(15,15);
        JLabel jLabel = new JLabel("测试",icon,SwingConstants.CENTER);
        jLabel.setVisible(true);

        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        container.add(jLabel);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(400,500);
        jFrame.setVisible(true);
    }
}
