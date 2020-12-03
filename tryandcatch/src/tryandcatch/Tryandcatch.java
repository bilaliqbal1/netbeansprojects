package tryandcatch;
import java.util.*;
import java.io.*;
/**
 *
 * @author Bilal Iqbal
 */
public class Tryandcatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
