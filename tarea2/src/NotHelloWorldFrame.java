
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JComponent;

	public class NotHelloWorldFrame extends JComponent
	{
		
		
		
	
	
		
		public NotHelloWorldFrame()
		{
		}
		
		Polygon trian = new Polygon();
		
		
		public void paintComponent (Graphics g)
			{
			   
				trian.addPoint(300, 10);
				
				//
				//pasto
				g.setColor(Color.green);
				g.fillRect(78, 100,100 , 100);
				//
				g.drawLine(270,302,180,200);
				//
				g.drawLine(270,400,80,200);
				//
				g.drawLine(370,303,180,100);
				//
				g.fillRect(270, 305,100 , 100);
				
				
				
				// OJO
				g.setColor(Color.BLUE);
				g.fillOval(530, 100,50, 50);
				g.setColor(Color.BLACK);
				g.drawArc(300,50, 500, 180,10, 170);
				g.drawOval(500, 70,100, 100);
				g.drawArc(300,-30, 500, 200,200, 150);
				
				
				
				
				
				
				 
				
				
			
				
				     
				
				
				
			}


		public void setDefaultCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}
			
			
	}