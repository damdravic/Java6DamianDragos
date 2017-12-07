/*
 * Check  if a CNP is found in our text
 */
package regexCNP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dragos
 */
public class RegexCNP {
    
    String regex="((1|2)(\\d{2}((((0[13578]|1[02])(0[1-9]|[1-2][0-9]|3[01]))|((0[469]|11)(0[1-9]|[1-2][0-9]|30))|(02(0[1-9]|1[0-9]|2[0-8]))))|(((0[48]|[2468][048]|[13579][26]))|(([02468][048])|[13579][26])00)(02)(29))([1-4][0-9]|5[0-2]|0[1-9])(\\d{3})(\\d))";
     
    
    public void search(String text){
  
              Pattern pattern = Pattern.compile(regex);
              Matcher matcher = pattern.matcher(text); 
              boolean found = false; 
              
             
              while (matcher.find()) { 
                String result; 
                Integer start;
                String forverify = "279146358279";
                
                int sum = 0;
                result = String.format (matcher.group()); 
              
                int last = Character.getNumericValue(result.charAt(12));
                       for(int i=0;i<=11;i++){
                           int x = Character.getNumericValue(result.charAt(i));
                           int y = Character.getNumericValue(forverify.charAt(i));
                            sum = sum + x*y;
                       
                       }
                           
                 
                    int lastDigit = sum%11;
                    if(lastDigit == 10){
                        lastDigit = 1;
                    }
                     
                    if(last == lastDigit){
                        System.out.println("I found CNP:" + result+"     from index " + matcher.start() + " to index " + matcher.end());
                    found = true; 
                    }
                    else{
                         System.out.println("I found something that match with regex - but it did not pass the test of last digit...   from index " + matcher.start() + " to index " + matcher.end());
                    }
                                   } 
               if (!found) { 
            System.out.println("No match found :("); 
                              } 
                                }
    
    
    
    
}
