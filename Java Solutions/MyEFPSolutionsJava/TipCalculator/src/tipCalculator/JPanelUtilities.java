package tipCalculator;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 A Utilities class for javax.swing.JPanel

 @author Ben Stone
 */
public class JPanelUtilities {

    public static JPanel createPanel(Component[] inComponentArray) {
        JPanel output = new JPanel();

        for (int i = 0; i < inComponentArray.length; i++)
        {
            output.add(inComponentArray[i]);
        }

        return output;
    }

    public static JPanel createPanel(boolean inPanelUseDoubleBuffer,
                                     Component[] inComponentArray) {
        JPanel output = new JPanel(inPanelUseDoubleBuffer);

        for (int i = 0; i < inComponentArray.length; i++)
        {
            output.add(inComponentArray[i]);
        }

        return output;
    }

    public static JPanel createPanel(ArrayList<Component> inComponentList) {

        JPanel output = new JPanel();

        for (Component comp : inComponentList)
        {
            output.add(comp);
        }

        return output;
    }

    public static JPanel createPanel(boolean inPanelUseDoubleBuffer,
                                     ArrayList<Component> inComponentList) {

        JPanel output = new JPanel(inPanelUseDoubleBuffer);

        for (Component comp : inComponentList)
        {
            output.add(comp);
        }

        return output;
    }

}
