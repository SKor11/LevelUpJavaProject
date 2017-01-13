import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

/**
 * Created by java on 27.12.2016.
 */
public class LabelPanel extends JPanel {

    public LabelPanel(){

        JLabel plainLabel = new JLabel("Plain Small Label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy Big Label");

        Font fancyFont = new Font("Serif", Font.BOLD | Font.ITALIC,32);

        fancyLabel.setFont(fancyFont);

        Icon folderIcon= new ImageIcon("Mushroom - 1UP.ico") ;
        fancyLabel.setIcon(folderIcon);
//        fancyLabel.setIcon(tigerIcon);;
//
//        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(fancyLabel);
    }
}
