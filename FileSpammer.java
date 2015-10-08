import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
/**
 * The Java FileSpammer
 * Stress tests your hard drive (or so we think it does)
 * @author Shravan Jambukesan
 * @author Nicholas Berry
 * PLEASE NOTE: The long term effects of using this program have not been studied yet. Proceed with caution. We are not responsible for any damage this program causes. 
 */
public class FileSpammer
{
    public static void main(String[] paramArrayOfString) throws IOException
    {
        String str = "";
        for (double d1 = Double.MIN_VALUE; d1 <= Double.MAX_VALUE; d1 += 0.01) {
        try
        {
            str = "FILESPAM" + (int)(d1 * 100.0) + ".txt";
            Thread.sleep(125);
            PrintWriter localPrintWriter = new PrintWriter(str);
            for (int i = 0; i < 100; i++)
            {
              double d2 = Math.random() + Double.MAX_VALUE + Double.MIN_VALUE;
              System.out.println(d2);
            }
         }
         catch (Exception e)
         {
            System.out.print("Error " + e);
         }
      }  
    }
}
