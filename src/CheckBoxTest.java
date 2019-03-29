import com.sun.org.apache.bcel.internal.generic.POP2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame {

    public CheckBoxTest(){
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.add(new JCheckBoxMenuItem());

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();

        JTextArea jTextArea = new JTextArea();

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(jPanel1,BorderLayout.NORTH);

        final JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel1.add(jScrollPane);

        container.add(jPanel2,BorderLayout.SOUTH);

        jPanel2.add(jCheckBox);
        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("复选框1被选中\n");
            }
        });

        setVisible(true);
        setSize(200,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main (String[] args){
        new CheckBoxTest();
    }

}
