
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gki.about.About;
import gki.humanLanguage.HumanLanguage;

public class L1243 extends JFrame {
	public L1243() {
		 HumanLanguage hl=new HumanLanguage();
		 System.out.println("No.of Human Language  = " +hl.list.size());
		 setLayout(null);
		 JComboBox<String> sg=new JComboBox<>();
       
		 for(String s:hl.list) {
			 sg.addItem(s);
	     }
		 System.out.println(new About());
		 add(sg);
		 sg.setBounds(0, 0, 300, 25);
		 
		 sg.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				 System.out.println(e.getItem());
			}
		});
		 
		 setVisible(true);
		 setSize(500,500);
		 setTitle("1243 Languages List");
         setIconImage(new ImageIcon(getClass().getResource("/gki/about/gobalkrishnan_v.jpg")).getImage());
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
	}
	
 public static void main(String[] args) {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    new L1243();
 }
}
