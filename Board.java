package Project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JOptionPane;

public class Board{
     String username1;
     String password1;
    private JButton pb = new JButton("Pharmacist");
    private JButton cb = new JButton("Customer");
    private JButton btnlogin = new JButton("Login");
    private JLabel pressed = new JLabel("");
    private JLabel LoginSuccessful = new JLabel("Login Successful");
    private JLabel username = new JLabel("Username");
    private JLabel password = new JLabel("Password");
    private JTextField un = new JTextField(10);
    private JTextField pass = new JTextField(10);
    
    public JFrame f = new JFrame();
        
    Board(){
     f.setSize(800,200);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
     f.add(cb);
     f.add(pb);
     f.add(pressed);
     f.setVisible(true);
     cb.addActionListener(new Choice());
     pb.addActionListener(new Choice());
    }
    public class Choice implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonpressed = e.getSource();
            if (buttonpressed.equals(pb)) {
                pressed.setText("Pharmacist");
                f.add(username);
                f.add(un);
                f.add(password);
                f.add(pass);
                f.add(btnlogin);
                btnlogin.addActionListener(new loginaction());
            }
            if (buttonpressed.equals(cb)) {
                pressed.setText("Customer");
                CustomerChoice cc = new CustomerChoice();
                f.dispose();
            }
        }
    }
    public class loginaction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {
                 username1 = un.getText();
                 password1 = pass.getText();
                 if( username1.isEmpty() || password1.isEmpty())
                { 
                JOptionPane.showMessageDialog(null, "Please enter the Username and the Password");
                }
                 else{
            UsernameAndPassword uandp = new UsernameAndPassword(username1,password1);
            f.dispose();
                 }
        }
    }
}