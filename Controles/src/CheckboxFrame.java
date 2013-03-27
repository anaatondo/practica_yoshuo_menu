import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




	


public class CheckboxFrame  extends JFrame
{
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGTH=200;
	
	private JLabel lblText;
	private JCheckBox bold;
	private JCheckBox italic;
	private static final int FONTSIZE=12;
	private static final Object BorderaLayout = null;
	private static final int SOUTH = 0;

	public  CheckboxFrame ()
	{
		this.setSize(400,400);
		this.setDefaultCloseOperation(1);
		this.setVisible(true);
		this.setTitle("PRUEBA DE CHECKBOK");
		
		
		lblText= new JLabel ("estos son CHECKBOK");
		lblText.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
		this.add(lblText,BorderLayout.NORTH);
		
		ActionListener Listener =new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int mode=0;
				if(bold.isSelected())
					mode+=Font.BOLD;
				
				if(italic.isSelected())
					mode+=Font.ITALIC;
				
				lblText.setFont(new Font("Serif" , mode, FONTSIZE));
				
				
			}
		};
		
		JPanel btnPanel =new JPanel();
		bold=new JCheckBox("Bold");
		bold.addActionListener(Listener);
		btnPanel.add(bold);
		
		italic=new JCheckBox("italic");
		italic.addActionListener(Listener);
		btnPanel.add(italic);
		this.add(btnPanel, BorderaLayout, SOUTH);
			
	}
}

