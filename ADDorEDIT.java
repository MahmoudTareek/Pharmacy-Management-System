package Project;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ADDorEDIT {
    private JButton add = new JButton("Add");
    private JButton edit = new JButton("Edit");
    private JLabel l = new JLabel("Do you want to add or edit drug?");
    JFrame f = new JFrame();
    
    ADDorEDIT()
    {
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        f.add(l);
        f.add(add);
        f.add(edit);
        f.setVisible(true);
        add.addActionListener(new action());
        edit.addActionListener(new action());
    }
    public class action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object choice = e.getSource();
            if (choice.equals(add)) {
                Drug d = new Drug();
                f.dispose();
            }
            if (choice.equals(edit)) {
                PharmacistSearch s = new PharmacistSearch();
                f.dispose();
            }

        }
            
        }
}
