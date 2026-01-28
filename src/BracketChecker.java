import java.io.*;
import java.net.URL;  
    
/**
 * class BracketChecker
 *
 * @author Jim
 * @version 1.0
 */
public class BracketChecker
{
    // stack is of type java.util.Stack
    private Stack myStack = new Stack(100);

    public void check() throws IOException {
        
        // opens file in project directory
        URL url = getClass().getClassLoader().getResource("Track.txt");
        if (url == null)
            throw new IOException("File not found");
        InputStream in = url.openStream();
        
        int i;
        char c;
        
        // read each character in the file
        // add a new object to the stack every time an opening brace is read
        // remove an object every time a closing brace is read
       while ((i = in.read()) != -1) {
           c = (char)i;
            // print out the current character
            System.out.print(c);     
           // if character is closing brace, the stack should not be empty
           if (c == '}') {
               if (myStack.isEmpty()) System.out.println("\n ***** Error: missing {  *****");
                // remove top object of stack
                else myStack.pop(); 
            }
            else {
                if (c == '{') 
                     myStack.push(new Object());  
            }
        }
        // stack should end up empty if braces balance
        if (!myStack.isEmpty()) System.out.println("\n ***** Error: missing }  *****");
        in.close();
   }
}