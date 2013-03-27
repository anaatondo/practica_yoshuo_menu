import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.text.TextAction;


public class CopyOfmenuframe extends JFrame{
	
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGTH=200;
	
	JMenuBar menuBar;
	JMenu menuArchivo;
	JMenu menuAbrir;
	JMenuItem menuItem;
    JPanel popupPanel;
	JPopupMenu popup;
	public  CopyOfmenuframe(){

		JMenuBar menuBar;
		JMenu menuArchivo;
		JMenuItem menuItem;
		JPanel popupPanel;
		JPopupMenu popup;

	
	
		this.setTitle("Prueba de Menu");
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		menuArchivo=new JMenu("Archivo");
		menuBar.add(menuArchivo);
		menuItem=new JMenuItem("Abrir");
		menuArchivo.add(menuItem);
		menuItem=new JMenuItem("Guardar");
		menuArchivo.add(menuItem);
		menuItem=new JMenuItem("Cerrar");
		menuArchivo.add(menuItem);
		menuItem=new JMenuItem("Salir");
		menuArchivo.add(menuItem);
		popupPanel=new JPanel();
		this.add(popupPanel);
		popup= new JPopupMenu();
		//this.popupPanel.add(popup);
		//popup.add(new JMenuItem("Cortar"));
		popupPanel.setComponentPopupMenu(popup);
		
		//action de cortar
		Action cutAction= new TestAction("Cortar");
		cutAction.putValue(Action.SMALL_ICON, new ImageIcon("Cut.png"));
		
		//action de pegar
		Action pasteAction=new TestAction("Pegar");
		pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("Paste.png"));
		
		//action de copiar
		Action copyAction= new TestAction("Copiar");
		copyAction.putValue(Action.SMALL_ICON, new ImageIcon("Copy.png"));
		
		
		

		popup.add(copyAction);
		popup.add(pasteAction);
		popup.add(cutAction);
	}
		class TestAction extends  AbstractAction
		{
		   public TestAction(String name)
		    {
	 		super(name);
		    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				System.exit(0);
			}		
		}
		
	}


