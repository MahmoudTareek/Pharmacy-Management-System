package Project;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CustomerSearch {
         private JLabel drugName;
        // private JTextField DRUGNAME;
         private JButton search;
         private JComboBox combo;
                 JFrame f = new JFrame();
                 JPanel Panel =new JPanel();
                 
                 
        CustomerSearch()
        {
            f.setSize(600,200);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(Panel);
            drugName = new JLabel("DRUG NAME");  
            drugName.setFont(new Font("Arial", Font.PLAIN, 20)); 
            drugName.setSize(200, 150); 
            drugName.setLocation(50, 85); 
            Panel.add(drugName); 
            combo  = new JComboBox();
            combo.addItem("Advil");
            combo.addItem("Aspirin");     
            combo.addItem("Claritin");
            combo.addItem("Ketofan");
            combo.addItem("Kongestal");
            combo.addItem("Move cream");
            combo.addItem("Move spray");
            combo.addItem("Panadol");
            combo.addItem("Parastamol");
            combo.addItem("Paxil");
            combo.addItem("Pepcid");
            combo.addItem("Powercaps");


            Panel.add(combo);

            search = new JButton("Search");
            search.setFont(new Font("Arial", Font.PLAIN, 20));
            search.setSize(150, 150); 
            search.setLocation(50, 85); 
            Panel.add(search); 

            f.setVisible(true);
        }
        
        

}
