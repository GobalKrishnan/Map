import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gki.human.language.HumanLanguage;
import gki.human.language.languagelist.HumanLanguageList;
import gki.human.language.languagelist.HumanLanguageListListener;

public class HumanLanguageListExample extends JFrame{
	
    public HumanLanguageListExample() {
setLayout(null);
       // CountryList l=new CountryList();
    	
  
  
        
  HumanLanguage hl=new HumanLanguage();
  System.out.println(hl.list().size());
  
  
  HumanLanguageList li=new HumanLanguageList();
  
  JLabel l=new JLabel();
  l.setBounds(0, 0, 300, 100);
  l.setForeground(Color.BLUE);
  l.setFont(new Font("Arial", Font.BOLD, 50));
  add(l);  
  
  li.setLocation(0,100);
  li.addHumanLanguageListListener(new HumanLanguageListListener() {
	
	@Override
	public void languageName(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		l.setText(s);
	}
});
  
  add(li);
  
  
  
        //add(so);
   
  
       setIconImage(new ImageIcon( getClass().getResource("/gki/human/language/images/gobalkrishnan_v.jpg")).getImage());
       setTitle("Gobal Krishnan V [D.O.B 18-06-1995]");
    	setVisible(true);
    	setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
       new HumanLanguageListExample();
	}

}

