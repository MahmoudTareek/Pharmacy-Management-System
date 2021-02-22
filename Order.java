package Project;
import java.awt.Font;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Order {
    private JLabel drugName;
    private JTextField DRUGNAME;
    private JLabel number;
    private JTextField NUMBER;
    private JLabel address;
    private JTextField ADDRESS;
    private JButton order;
    
    private static int count;
        Order(){
    JFrame Frame=new JFrame();
    JPanel Panel =new JPanel();
      //Frame.add(Drug);
      Frame.add(Panel);
      
       Frame. setTitle("Drugs");
        Frame.setBounds(800,350,900,600);
        Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Frame.setResizable(true);
       
      //  con=getContentPane();
       Panel.setLayout(null);
        
//        count++;
//        drugID = count;
        drugName = new JLabel("DRUG NAME");  
        drugName.setFont(new Font("Arial", Font.PLAIN, 20)); 
        drugName.setSize(200, 20); 
        drugName.setLocation(100, 100); 
        Panel.add(drugName); 
        
        
        DRUGNAME = new JTextField(); 
        DRUGNAME.setFont(new Font("Arial", Font.PLAIN, 15)); 
        DRUGNAME.setSize(150, 20); 
        DRUGNAME.setLocation(520,100 ); 
        Panel.add(DRUGNAME);
        
        number = new JLabel("MOBILE NUMBER");  
        number.setFont(new Font("Arial", Font.PLAIN, 20)); 
        number.setSize(200, 150); 
        number.setLocation(100, 85); 
        Panel.add(number); 
        
        NUMBER = new JTextField(); 
        NUMBER.setFont(new Font("Arial", Font.PLAIN, 15)); 
        NUMBER.setSize(150, 20); 
        NUMBER.setLocation(520,150 ); 
        Panel.add(NUMBER);
        
        address = new JLabel("ADDRESS");  
        address.setFont(new Font("Arial", Font.PLAIN, 20)); 
        address.setSize(200, 20); 
        address.setLocation(100, 200); 
        Panel.add(address); 
        
        ADDRESS = new JTextField(); 
        ADDRESS.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ADDRESS.setSize(150, 20); 
        ADDRESS.setLocation(520,200 ); 
        Panel.add(ADDRESS);
        
        order = new JButton("Order");
        order.setFont(new Font("Arial", Font.PLAIN, 20)); 
        order.setSize(200, 20); 
        order.setLocation(100, 250); 
        Panel.add(order); 
        
        
         Frame.setVisible(true);
    }
}
