package Project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class files{
    files(String stet){
    String filename = "out";
    try
    {
        FileOutputStream fileos = new FileOutputStream(filename);
        ObjectOutputStream os = new ObjectOutputStream(fileos);
        os.writeUTF(stet);
    }
    catch (FileNotFoundException ex)  
    {             JOptionPane.showMessageDialog(null, "File not found",null, JOptionPane.ERROR_MESSAGE);

        
    }   catch (IOException ex) {

        }
}
}