

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gki.humanlanguagelist.HumanLanguageList;

public class LanguageTest extends JFrame {

	
	public LanguageTest() {
		
	       HumanLanguageList hlt=new HumanLanguageList();
	       System.out.println(hlt.list.length+": HumanLanguage");
	       

		
		
		setLayout(null);
		
		JComboBox<String> list=new JComboBox<String>();
		list.setBounds(0, 0, 300, 25);
		
		setIconImage(new ImageIcon(getClass().getResource("/gki/logo/gobalkrishnan_v.jpg")).getImage());
		setTitle("7535 Human Language List");
		add(list);
		
		
		for(String s:hlt.list) {
	    
		  list.addItem(s);
		}
		
		JLabel l=new JLabel();
		l.setFont(new Font("Arial", Font.BOLD, 30));
		l.setForeground(new Color(50,0,100));
		l.setBounds(20, 200, 300, 50);
		add(l);
		
		
		list.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l.setText((String)e.getItem());
			}
		});
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new LanguageTest();
	}

}
