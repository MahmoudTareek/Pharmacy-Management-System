package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Drug extends JFrame implements ActionListener {

 //   private Container con;
    private JLabel drugID;
    private JTextField DRUGID;
    private JLabel drugName;
    private JTextField DRUGNAME;
    private JLabel expirationDate;
    private JTextField EXPDATE;
    private JLabel manufacturedDate;
    private JTextField MANDATE;
    private JLabel drugPrice;
    private JTextField DRUGPRICE;
    private JButton done;
    private static int count;
public Drug(){
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
        drugID = new JLabel("DRUG ID");  
        drugID.setFont(new Font("Arial", Font.PLAIN, 20)); 
        drugID.setSize(200, 20); 
        drugID.setLocation(100, 100); 
        Panel.add(drugID); 
        
        
        DRUGID = new JTextField(); 
        DRUGID.setFont(new Font("Arial", Font.PLAIN, 15)); 
        DRUGID.setSize(150, 20); 
        DRUGID.setLocation(520,100 ); 
        Panel.add(DRUGID);
        
        drugName = new JLabel("DRUG NAME");  
        drugName.setFont(new Font("Arial", Font.PLAIN, 20)); 
        drugName.setSize(200, 150); 
        drugName.setLocation(100, 85); 
        Panel.add(drugName); 
        
        DRUGNAME = new JTextField(); 
        DRUGNAME.setFont(new Font("Arial", Font.PLAIN, 15)); 
        DRUGNAME.setSize(150, 20); 
        DRUGNAME.setLocation(520,150 ); 
        Panel.add(DRUGNAME);


        expirationDate = new JLabel("EXPIRATION DATE");  
        expirationDate.setFont(new Font("Arial", Font.PLAIN, 20)); 
        expirationDate.setSize(200, 20); 
        expirationDate.setLocation(100, 200); 
        Panel.add(expirationDate); 
        
        EXPDATE = new JTextField(); 
        EXPDATE.setFont(new Font("Arial", Font.PLAIN, 15)); 
        EXPDATE.setSize(150, 20); 
        EXPDATE.setLocation(520,200 ); 
        Panel.add(EXPDATE);


        manufacturedDate = new JLabel("MANUFACTURED DATE");  
        manufacturedDate.setFont(new Font("Arial", Font.PLAIN, 20)); 
        manufacturedDate.setSize(500, 20); 
        manufacturedDate.setLocation(100, 250); 
        Panel.add(manufacturedDate); 
        
        MANDATE = new JTextField(); 
        MANDATE.setFont(new Font("Arial", Font.PLAIN, 15)); 
        MANDATE.setSize(150, 20); 
        MANDATE.setLocation(520,250 ); 
        Panel.add(MANDATE);        


        drugPrice = new JLabel("DRUG PRICE");  
        drugPrice.setFont(new Font("Arial", Font.PLAIN, 20)); 
        drugPrice.setSize(200, 20); 
        drugPrice.setLocation(100, 300); 
        Panel.add(drugPrice); 
        
        DRUGPRICE = new JTextField();
        DRUGPRICE.setFont(new Font("Arial", Font.PLAIN, 15)); 
        DRUGPRICE.setSize(150, 20);
        DRUGPRICE.setLocation(520,300);
        Panel.add(DRUGPRICE);
        
        done = new JButton("Done");
        done.setFont(new Font("Arial", Font.PLAIN, 15)); 
        done.setSize(150, 20);
        done.setLocation(520,350);
        Panel.add(done);
        done.addActionListener(new action());
         Frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        files f1 = new files(DRUGID.getText());
        files f2 = new files(DRUGNAME.getText());
        files f3 = new files(EXPDATE.getText());
        files f4 = new files(MANDATE.getText());
        files f5 = new files(DRUGPRICE.getText());
    }     
}
}
