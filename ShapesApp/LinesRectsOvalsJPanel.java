// LinesRectsOvalsJPanel.java
// Drawing lines, rectangles and ovals.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinesRectsOvalsJPanel extends JPanel 
{
	public LinesRectsOvalsJPanel() {}
	
	// display various lines, rectangles and ovals
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g ); // call superclass's paint method

		this.setBackground( Color.WHITE );

		g.setColor( Color.PINK );
		g.drawLine( 5, 30, 380, 30 ); // 1

		g.setColor( Color.YELLOW );
		g.drawRect( 5, 40, 90, 55 ); // 2
		g.fillRect( 100, 40, 90, 55 ); // 3

		g.setColor( Color.BLACK );
		g.fillRoundRect( 195, 40, 90, 55, 50, 50 ); // 4
		g.drawRoundRect( 290, 40, 90, 55, 20, 20 ); // 5

		g.setColor( Color.BLUE );   
		g.draw3DRect( 5, 100, 90, 55, true ); // 6
		g.fill3DRect( 100, 100, 90, 55, false ); // 7

		g.setColor( Color.RED );
		g.drawOval( 195, 100, 90, 55 ); // 8
		g.fillOval( 290, 100, 90, 55 ); // 9
	} // end method paintComponent
} // end class LinesRectsOvalsJPanel