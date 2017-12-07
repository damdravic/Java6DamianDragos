/*
 * 
 */
package regexCNP;

import java.io.IOException;



/**
 *
 * @author Dragos
 */
public class TestCNP {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
      Choise c = new Choise();
      SourceText src = new SourceText();
      RegexCNP cnp = new RegexCNP();
      
      c.choise();
      src.source(c.getInput());
      cnp.search(src.getText());
    }
    
}
