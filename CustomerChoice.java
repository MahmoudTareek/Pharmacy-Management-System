package Project;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class CustomerChoice {
    private JButton search = new JButton("Search");
    private JButton order = new JButton("Order");
    private JLabel l = new JLabel("Do you want to search or order a drug?");
    JFrame f = new JFrame();
    
    CustomerChoice()
    {
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        f.add(l);
        f.add(search);
        f.add(order);
        f.setVisible(true);
        search.addActionListener(new action());
        order.addActionListener(new action());
    }
    public class action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object choice = e.getSource();
            if (choice.equals(search)) {
                CustomerSearch s = new CustomerSearch();
                f.dispose();
            }
            if (choice.equals(order)) {
                Order o = new Order();
                f.dispose();
            }
        }
            
        }
}
