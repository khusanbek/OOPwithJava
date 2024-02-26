// ClientGUI.java
// ClientGUI, all implementation codes removed.
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class ClientGUI extends JFrame
{
    private JMenu serverMenu; // for connecting/disconnecting server
    private JTextArea messageArea; // displays messages
    private JTextArea inputArea; // inputs messages
    private JButton connectButton; // button for connecting
    private JMenuItem connectMenuItem; // menu item for connecting
    private JButton disconnectButton; // button for disconnecting
    private JMenuItem disconnectMenuItem; // menu item for disconnecting
    private JButton sendButton; // sends messages
    private JLabel statusBar; // label for connection status

    // ClientGUI constructor
    public ClientGUI() // MessageManager manager
    {
        super( "ClientGUI Demo" );

        serverMenu = new JMenu ( "Server" ); // create Server JMenu
        JMenuBar menuBar = new JMenuBar(); // create JMenuBar
        menuBar.add( serverMenu ); // add server menu to menu bar
        setJMenuBar( menuBar ); // add JMenuBar to application

        // create ImageIcon for connect buttons
        Icon connectIcon = new ImageIcon(
                getClass().getResource( "images/Connect.gif" ) );

        // create connectButton and connectMenuItem
        connectButton = new JButton( "Connect", connectIcon );
        connectMenuItem = new JMenuItem( "Connect", connectIcon );

        // create ImageIcon for disconnect buttons
        Icon disconnectIcon = new ImageIcon(
                getClass().getResource( "images/Disconnect.gif" ) );

        // create disconnectButton and disconnectMenuItem
        disconnectButton = new JButton( "Disconnect", disconnectIcon );
        disconnectMenuItem = new JMenuItem( "Disconnect", disconnectIcon );

         // add connect and disconnect JMenuItems to fileMenu
        serverMenu.add( connectMenuItem );
        serverMenu.add( disconnectMenuItem );

        // add connect and disconnect JButtons to buttonPanel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add( connectButton );
        buttonPanel.add( disconnectButton );

        messageArea = new JTextArea(); // displays messages
        messageArea.setWrapStyleWord( true ); // set wrap style to word
        messageArea.setLineWrap( true ); // enable line wrapping

        // put messageArea in JScrollPane to enable scrolling
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout( new BorderLayout( 10, 10 ) );
        messagePanel.add( new JScrollPane( messageArea ),
                BorderLayout.CENTER );

        inputArea = new JTextArea( 4, 20 ); // for entering new messages
        inputArea.setWrapStyleWord( true ); // set wrap style to word
        inputArea.setLineWrap( true ); // enable line wrapping

        // create Icon for sendButton
        Icon sendIcon = new ImageIcon(
                getClass().getResource( "images/Send.gif" ) );

        sendButton = new JButton( "Send", sendIcon ); // create send button

        Box box = new Box( BoxLayout.X_AXIS ); // create new box for layout
        box.add( new JScrollPane( inputArea ) ); // add input area to box
        box.add( sendButton ); // add send button to box
        messagePanel.add( box, BorderLayout.SOUTH ); // add box to panel

        // create JLabel for statusBar with a recessed border
        statusBar = new JLabel( "ClientGUI Demo" );
        statusBar.setBorder( new BevelBorder( BevelBorder.LOWERED ) );

        add( buttonPanel, BorderLayout.NORTH ); // add button panel
        add( messagePanel, BorderLayout.CENTER ); // add message panel
        add( statusBar, BorderLayout.SOUTH ); // add status bar
    } // end ClientGUI constructor
} // end class ClientGUI
/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/