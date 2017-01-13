import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class Main {

   static int counter = 0 ;
    public static void main(String [] args) throws InterruptedException {
        JFrame frame = new JFrame("This is my title");
        frame.setSize(500,500);
        frame.add(new LabelPanel());
        frame.add(new Menu());


        BorderLayout layout = new BorderLayout();

        LabelPanel labelPanel = new LabelPanel();
        Menu menu = new Menu();
        layout.addLayoutComponent(labelPanel,BorderLayout.CENTER);
        layout.addLayoutComponent(menu,BorderLayout.PAGE_START);

//        frame.add(labelPanel);

        JLabel label = new JLabel();
        label.setText("0");
        layout.addLayoutComponent(label,BorderLayout.CENTER);

        frame.add(label);

     JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText((++counter)+"");
            }
        });

        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(30,15));

        btnPanel.add(button);
      ;
        layout.addLayoutComponent(button,BorderLayout.CENTER);

        frame.add(btnPanel);


//        frame.add(button);

        frame.add(menu);

        frame.setLayout(layout);


        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        Thread.sleep(2000);
//
//        frame.setState(Frame.ICONIFIED);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.NORMAL);




    }


}
