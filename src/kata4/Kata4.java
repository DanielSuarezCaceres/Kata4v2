
package kata4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Kata4 {
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
        
         File file = new File("c:\\");
         String[] names = file.list();
         for (String name : names) {
             System.out.println(name);
         }
         
        
    }
}
    
