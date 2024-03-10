
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager.*;

public class CalculatorGUI extends JFrame
{
    private JTextField textField;
    private JPanel buttonPanel;
    private JButton buttons[]; // array of buttons
    private final String names[] =
            {"7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+"};
    private GridLayout gridLayout; // first gridlayout
    private int firstInput;
    private int secondInput;
    private char operation;
    private boolean firstPicked;
    private boolean secondPicked;
    private boolean operationPicked;
    // no-argument constructor
    public CalculatorGUI()
    {
        super("Calculator");
        setLayout(new FlowLayout());

        firstInput = secondInput = 0;
        operation = '\u0000';

        firstPicked = secondPicked = operationPicked = false;

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(235, 160));
        gridLayout = new GridLayout(4, 4, 4,2); // 2 by 3; gaps of 5
        buttonPanel.setLayout(gridLayout); // set JFrame layout

        textField = new JTextField(20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);
        buttons = new JButton[names.length]; // create array of JButtons

        ButtonListener buttonListener = new ButtonListener();

        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[ count ]);
            buttons[count].addActionListener(buttonListener);
            buttonPanel.add(buttons[count]); // add button to JFrame
        } // end for

        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    } // end GridLayoutFrame constructor

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) {

            for (int count = 0; count < names.length; count++) {

                if (event.getSource() == buttons[count]) {

                    if(CalcUtil.isOperation(names[count]) && !firstPicked
                            && !secondPicked && !operationPicked)
                        JOptionPane.showMessageDialog(CalculatorGUI.this,
                                "Please pick number first!","Pick number!!!",
                                    JOptionPane.INFORMATION_MESSAGE);

                    if(CalcUtil.isInputNumber(names[count]) && !firstPicked) {

                        firstInput = Integer.parseInt(names[count]);
                        textField.setText(String.format("%d",firstInput));
                        firstPicked = true;
                    }

                    if(CalcUtil.isOperation(names[count]) && firstPicked) {

                        operation = names[count].charAt(0);
                        textField.setText(String.format("%c",operation));
                        operationPicked = true;
                    }

                    if(CalcUtil.isInputNumber(names[count]) &&
                            firstPicked && operationPicked) {
                        secondInput = Integer.parseInt(names[count]);
                        textField.setText(String.format("%d",secondInput));

                        secondPicked = true;
                    }

                    if(CalcUtil.resultOperation(names[count]) &&
                            firstPicked && secondPicked && operationPicked) {

                        String result = String.format("%d", CalcUtil.calculate(
                                firstInput, secondInput, operation));

                        textField.setText(result);

                        firstPicked = secondPicked = operationPicked = false;
                        firstInput = secondInput = 0;
                        operation = '\u0000';
                    }
                }
            }
        }
    }
} // end class CalculatorGUI