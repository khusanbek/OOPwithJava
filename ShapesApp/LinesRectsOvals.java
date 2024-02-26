// LinesRectsOvals.java
// Creates Panel and launches the components.
public class LinesRectsOvals
{
	public LinesRectsOvals() {}
	
	// execute application
	public void run()
	{
		// create frame for LinesRectsOvalsJPanel
		javax.swing.JFrame frame = 
							new javax.swing.JFrame(
								"Drawing variety of shapes.");
		frame.setDefaultCloseOperation(
							javax.swing.JFrame.EXIT_ON_CLOSE);

		LinesRectsOvalsJPanel linesRectsOvalsJPanel = 
							new LinesRectsOvalsJPanel(); 
		
		frame.add( linesRectsOvalsJPanel ); // add panel to frame
		frame.setSize( 400, 210 ); // set frame size
		frame.setVisible( true ); // display frame
	} // end main
} // end class LinesRectsOvals