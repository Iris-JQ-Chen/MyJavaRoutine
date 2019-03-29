import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {
    public static void main (String args[]){
        new MyFrame();
    }

    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);

        JLabel jLabel = new JLabel("这是一个JFrame窗体");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton jButton = new JButton("弹出对话框");
        jButton.setBounds(10,10,100,21);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });

        container.add(jLabel);
        container.add(jButton);

        setVisible(true);
        setSize(200,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MyJDialog extends JDialog{
    public MyJDialog (MyFrame myFrame){
        super(myFrame,"第一个JDialog窗体",true);

        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,100,100);
    }
}
