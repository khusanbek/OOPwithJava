import javax.swing.*;

public class CalculatorRunner {
    private static void setNimbusLookAndFeel() {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
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

    public void run() {

        setNimbusLookAndFeel();

        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        calculatorGUI.setResizable(false);
        calculatorGUI.setSize( 260, 245 ); // set frame size
        calculatorGUI.setVisible( true ); // display frame
    }
}
