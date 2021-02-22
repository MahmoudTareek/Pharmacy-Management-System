package Project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PharmacistSearch {

         private JLabel drugName;
         private JTextField DRUGNAME;
         private JButton search;
                 JFrame f = new JFrame();
                 JPanel Panel =new JPanel();
                 
                 
        PharmacistSearch()
        {
            f.setSize(600,200);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(Panel);
            drugName = new JLabel("DRUG NAME");  
            drugName.setFont(new Font("Arial", Font.PLAIN, 20)); 
            drugName.setSize(200, 150); 
            drugName.setLocation(50, 85); 
            Panel.add(drugName); 
        
            DRUGNAME = new JTextField(10); 
            DRUGNAME.setFont(new Font("Arial", Font.PLAIN, 15)); 
            DRUGNAME.setSize(150, 20); 
            DRUGNAME.setLocation(520,150 ); 
            Panel.add(DRUGNAME);
            
            search = new JButton("Search");
            search.setFont(new Font("Arial", Font.PLAIN, 20));
            search.setSize(150, 150); 
            search.setLocation(50, 85); 
            Panel.add(search); 
            
            search.addActionListener(new searchbtn());
            f.setVisible(true);
        }
        
            public class searchbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                Drug d = new Drug();
                f.dispose();
        }


        }
}
