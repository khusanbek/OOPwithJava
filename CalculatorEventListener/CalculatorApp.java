// Fig. 11.43: GridLayoutFrame.java
// Demonstrating GridLayout.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager.*;

public class CalculatorApp extends JFrame
{
    private JTextField textField;
    private JPanel buttonPanel;
    private JButton buttons[]; // array of buttons
    private final String names[] =
            {"7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+"};
    private GridLayout gridLayout1; // first gridlayout

    // no-argument constructor
    public CalculatorApp()
    {
        super("Calculator");
        setLayout(new FlowLayout());

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(235, 160));
        gridLayout1 = new GridLayout(4, 4, 4,2); // 2 by 3; gaps of 5
        buttonPanel.setLayout(gridLayout1); // set JFrame layout

        textField = new JTextField(20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);
        buttons = new JButton[names.length]; // create array of JButtons

        add(textField, BorderLayout.NORTH);

        ButtonListener buttonListener = new ButtonListener();

        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[ count ]);
            buttons[count].addActionListener(buttonListener);
            buttonPanel.add(buttons[count]); // add button to JFrame
        } // end for

        add(buttonPanel, BorderLayout.CENTER);
    } // end GridLayoutFrame constructor

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) {

            String input = "";

            for (int count = 0; count < names.length; count++) {

                if (event.getSource() == buttons[count]) {
                    input = names[count];
                    textField.setText(input);
                }
            }
        }
    }

    private static void setNimbusLookAndFeel() {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
    // handle button events by toggling between layouts
    public static void main( String args[] )
    {
        setNimbusLookAndFeel();

        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        calculatorApp.setResizable(false);
        calculatorApp.setSize( 260, 245 ); // set frame size
        calculatorApp.setVisible( true ); // display frame
    } // end main
} // end class GridLayoutFrame