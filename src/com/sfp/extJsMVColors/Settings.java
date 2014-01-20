package com.sfp.extJsMVColors;

import com.intellij.openapi.options.Configurable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by stefanmeschke on 10.01.14.
 */
public class Settings implements Configurable {

    public JComponent createComponent(){

        // good generator: http://www.wsoftware.de/src/SpeedJGApplet.html

        JPanel colorChangePanel = new JPanel();
        colorChangePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JLabel colorDescriptionLabel = new JLabel();
        colorDescriptionLabel.setText("Please set the colors");
        colorChangePanel.add(colorDescriptionLabel);

        return colorChangePanel;
    }

    public void apply(){

    }

    public boolean isModified(){

        return true;
    }

    public void reset(){

    }

    public void disposeUIResources(){

    }

    public String getHelpTopic(){
        String helpTopic = new String();

        return helpTopic;
    }

    public String getDisplayName(){
        String displayName = new String();
        displayName = "Plugin: ExtJS MVC Colors and Labels";
        return displayName;
    }
}
