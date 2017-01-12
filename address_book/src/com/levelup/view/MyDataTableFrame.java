package com.levelup.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by сергей on 12.01.2017.
 */
public class MyDataTableFrame {

    init(){
        Container container = getContentPane();
        TabbedPane tabbedPane = new TabbedPane();

        container.add(tabbedPane,BorderLayout.CENTER);
        container.add(new ToolPanel(tabbedPane),BorderLayout.PAGE_END);

        setVisible(true);
        setBounts(0,0,800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
