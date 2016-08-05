import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Tests
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		toolbar();
	}
	
	public static void toolbar()
	{
		JFrame frame = new JFrame("JToolBar Example");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JToolBar toolbar = new JToolBar();
	    toolbar.setRollover(true);

	    
	    JButton button = new JButton("button");
	    toolbar.add(button);
	    toolbar.addSeparator();
	    
	    toolbar.add(new JButton("button 2"));
	    
	    toolbar.add(new JComboBox(new String[]{"A","B","C"}));
	    
	    Container contentPane = frame.getContentPane();
	    contentPane.add(toolbar, BorderLayout.NORTH);
	    JTextArea textArea = new JTextArea();
	    JScrollPane pane = new JScrollPane(textArea);
	    contentPane.add(pane, BorderLayout.CENTER);
	    frame.setSize(350, 150);
	    frame.setVisible(true);
	}

}
