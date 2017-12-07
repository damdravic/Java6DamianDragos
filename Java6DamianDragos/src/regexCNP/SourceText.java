/*
 * the source of the text (input in console  or text file from server )
 */
package regexCNP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Dragos
 * 
 *
 */
public class SourceText {
    
    Scanner scan = new Scanner(System.in);
    private String text;
    
    public void source(String choise) throws MalformedURLException, IOException {
 
        if ("INPUT".equals(choise)){
          System.out.println("Enter the text :");
          text = scan.nextLine();
            
        }
        if ("FILE".equals(choise)){
        
          URL url = new URL("https://carbody.000webhostapp.com/cnp.txt");
          StringBuilder contentBuilder = new StringBuilder();
      try 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String currentLine;
        while ((currentLine = br.readLine()) != null)
        {
            contentBuilder.append(currentLine).append("\n");
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    text = contentBuilder.toString();
          System.out.println(text);

            
        }
        
        
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
