
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gki.country.countrylist.CountryList;
import gki.country.countrylist.CountryListListener;

public class Test extends JFrame{
	
    public Test() {
setLayout(null);
       // CountryList l=new CountryList();
    	
  CountryList so=new CountryList();
  so.addCountryListener(new CountryListListener() {
	
	@Override
	public void countryName(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
});
  
        
        
        add(so);
        
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
       new Test();
	}

}
