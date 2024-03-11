// RadioButtonFrame.java
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    private static int FONT_SIZE = 24;
    private static int BUTTON_FONT_SIZE = 20;

    public RadioButtonFrame()
    {
        super("RadioButton Test");
        setLayout(new FlowLayout());

        textField = new JTextField("What the font style change", 25);
        add(textField);

        plainJRadioButton = new JRadioButton("Plain", true);
        plainJRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, BUTTON_FONT_SIZE));

        boldJRadioButton = new JRadioButton("Bold", false);
        boldJRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, BUTTON_FONT_SIZE));

        italicJRadioButton = new JRadioButton("Italic", false);
        italicJRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, BUTTON_FONT_SIZE));

        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        boldItalicJRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, BUTTON_FONT_SIZE));

        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        plainFont = new Font("Serif", Font.PLAIN, FONT_SIZE);
        boldFont = new Font("Serif", Font.BOLD, FONT_SIZE);
        italicFont = new Font("Serif", Font.ITALIC, FONT_SIZE);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, FONT_SIZE);
        textField.setFont(plainFont);

        plainJRadioButton.addItemListener(
                new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(
                new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(
                new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(
                new RadioButtonHandler(boldItalicFont));
    }

    private class RadioButtonHandler implements ItemListener
    {
        private Font font;

        public RadioButtonHandler(Font f)
        {
            font = f;
        }

        public void itemStateChanged(ItemEvent event)
        {
            textField.setFont(font);
        }
    }

    public static void main(String[] args)
    {
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(500, 150);
        radioButtonFrame.setVisible(true);
    }
}