package Project;
import java.util.*;
import javax.swing.JOptionPane;
public class UsernameAndPassword {
    String[] usernames = {"pharmacy1","pharmacy2","pharmacy3","pharmacy4","pharmacy5"};
    String[] passwords = {"phar1","phar2","phar3","phar4","phar5"};
       UsernameAndPassword(String user, String pass)
       {
           Boolean flag = false;
           for (int i = 0; i < 5; i++) {
               if (user.equals(usernames[i])&& pass.equals(passwords[i])) {
                   flag = true;
                    ADDorEDIT ae = new ADDorEDIT();
               }
           }
           if (!flag) {
             JOptionPane.showMessageDialog(null, "The Username or the Password is worng",null, JOptionPane.ERROR_MESSAGE);
           }
       }
}
