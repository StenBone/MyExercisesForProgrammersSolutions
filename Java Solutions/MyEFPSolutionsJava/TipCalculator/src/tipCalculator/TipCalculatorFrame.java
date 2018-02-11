package tipCalculator;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 Frame responsible for displaying information to the user. Extends
 javax.swing.JFrame

 @author Ben Stone
 */
public class TipCalculatorFrame extends JFrame {

    // Constants used to define Frame characteristics
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    // Constants for intial messages for Displays
    private static final String BILL_AMOUNT_DISPLAY_INITIAL_MSG = "Bill Amount: $";
    private static final String TIP_RATE_DISPLAY_INITIAL_MSG = "Tip Rate: $";
    private static final String HINT_DISPLAY_INITIAL_MSG = "";
    private static final String TIP_DISPLAY_INITIAL_MSG = "Tip is $";
    private static final String TOTAL_DISPLAY_INITIAL_MSG = "Total is $";

    // Constants for Instance Variable Names to be used in Hint messages
    private static final String BILL_AMOUNT_NAME = "bill amount";
    private static final String TIP_RATE_NAME = "tip rate";

    // Constants for hint messages
    private static final String HINT_DSP_INVALID_NUM_MSG = "Please enter a valid number for %s.";
    private static final String HINT_DSP_NEG_SIGN_MSG = "Please enter a positive number for %s.";

    // Constants for JTextFields
    private static final int TEXT_FIELD_WIDTH_IN_CHARS = 6;

    // Constants for JTextFields Initial Messages
    private static final String BILL_AMOUNT_PROMPT_INITIAL_MSG = "0";
    private static final String TIP_RATE_PROMPT_INITIAL_MSG = "0";

    // Constants for Panels' properties
    private static final boolean PANELS_USE_DOUBLE_BUFFERING = true;

    // Constants for displayPanel properties
    private static final int DISPLAY_PANEL_NUM_OF_ROWS = 5;
    private static final int DISPLAY_PANEL_NUM_OF_COLUMNS = 1;

    // Instance Variables
    // Worker Vars
    private float billAmount, tip, tipRate, total = 0;

    // GUI Vars
    private JPanel displayPanel;

    // JLabels Declarations
    private JLabel billAmountDisplay;
    private JLabel tipRateDisplay;
    private JLabel hintDisplay;
    private JLabel tipDisplay;
    private JLabel totalDisplay;

    // JTextFields Declarations
    private JTextField billAmountPrompt;
    private JTextField tipRatePrompt;

    /**
     Initialize all object instance variables.
     */
    public TipCalculatorFrame() {

        // Helper Methods
        initJLabels();
        initJTextFields();
        initDisplayPanel();
        addDisplayPanelComponents();
        setPropertiesOfParentObject();

    }

    private void initJLabels() {

        // JLabels Initialization
        billAmountDisplay = new JLabel(BILL_AMOUNT_DISPLAY_INITIAL_MSG);
        tipRateDisplay = new JLabel(TIP_RATE_DISPLAY_INITIAL_MSG);
        hintDisplay = new JLabel(HINT_DISPLAY_INITIAL_MSG);
        tipDisplay = new JLabel(TIP_DISPLAY_INITIAL_MSG);
        totalDisplay = new JLabel(TOTAL_DISPLAY_INITIAL_MSG);
    }

    private void initJTextFields() {

        // JTextFields Initialization
        billAmountPrompt = new JTextField(BILL_AMOUNT_PROMPT_INITIAL_MSG,
              TEXT_FIELD_WIDTH_IN_CHARS);
        tipRatePrompt = new JTextField(TIP_RATE_PROMPT_INITIAL_MSG,
              TEXT_FIELD_WIDTH_IN_CHARS);
    }

    private void initDisplayPanel() {
        // Init displayPanel
        displayPanel = new JPanel(PANELS_USE_DOUBLE_BUFFERING);

        // Set displayPanel to a 5 row by 1 column grid
        displayPanel.setLayout(new GridLayout(DISPLAY_PANEL_NUM_OF_ROWS,
              DISPLAY_PANEL_NUM_OF_COLUMNS));
    }

    private void addDisplayPanelComponents() {

        // Add Components to displayPanel
        // Bill Amount Display and Prompt
        Component[] _billAmountComponents =
        {
            billAmountDisplay, billAmountPrompt
        };
        displayPanel.add(JPanelUtilities.createPanel(PANELS_USE_DOUBLE_BUFFERING,
              _billAmountComponents), 0);

        // Tip Rate Display and Prompt
        Component[] _tipRateComponents =
        {
            tipRateDisplay, tipRatePrompt
        };
        displayPanel.add(JPanelUtilities.createPanel(PANELS_USE_DOUBLE_BUFFERING,
              _tipRateComponents), 1);

        // Hint Display
        displayPanel.add(hintDisplay, 2);

        // Tip Display
        displayPanel.add(tipDisplay, 3);

        // Total Display
        displayPanel.add(totalDisplay, 4);
    }

    private void setPropertiesOfParentObject() {
        // JFrame Variable initialization
        // Add displayPanel to this JFrame
        this.add(displayPanel);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

}
