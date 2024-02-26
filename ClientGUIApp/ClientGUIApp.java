import javax.swing.*;

public class ClientGUIApp {

    public static void main(String[] args) {

        ClientGUI clientGUI = new ClientGUI();
        clientGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        clientGUI.setSize( 300, 400 ); // set window size
        clientGUI.setResizable( false ); // disable resizing
        clientGUI.setVisible( true );
    }
}
