package calculator;

import java.awt.*;
import javax.swing.*;

/**
 * Created by java on 27.12.2016.
 */
public class MainPanel {


    public MainPanel() {
        GridLayout gridLayout = new GridLayout(1,2);

        NumberPanel numberPanel = new NamberPanel();

        gridLayout.addLayoutComponent("NumberPanel",numberPanel);
        add(numberPanel);

        OperationPa = new NamberPanel();

        gridLayout.addLayoutComponent("NumberPanel",numberPanel);
        add(numberPanel);



        setLayout(gridLayout);
    }
}
