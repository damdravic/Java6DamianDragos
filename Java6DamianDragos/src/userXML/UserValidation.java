/*
 * the class that reads xml and verify if input username and password are found in XML file
 */
package userXML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author Dragos
 */
public class UserValidation {

    
    
   UserInput newuser = new UserInput();
    
    public void validating() {

    newuser.userInput();

    try {
          //path for XML file depending on the system
         String userDir = System.getProperty("user.dir");
         String path = userDir.concat("\\src\\userXML\\users.xml");
	 File xmlFile = new File(path);
         
          // create a new DocumentBuilderFactory
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
          // use the factory to create a documentbuilder
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           // create a new document from input source
	Document doc = dBuilder.parse(xmlFile);
         
	doc.getDocumentElement().normalize();
         // get all child nodes "USER"
	NodeList nList = doc.getElementsByTagName("USER");

	
           // get content of each child
	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			
			String xmluser = eElement.getElementsByTagName("USERNAME").item(0).getTextContent();
			String xmlpass = eElement.getElementsByTagName("PASSWORD").item(0).getTextContent();
                        String xmlrole = eElement.getElementsByTagName("USERROLE").item(0).getTextContent();

                         //verify if input username and password are the same with username and password found in this user node
                        if(xmluser.equals(newuser.getInUsername()) && xmlpass.equals(newuser.getInPassword())){
                            System.out.println("---------------------------------");
                            System.out.println("- Valid User       Role - " + xmlrole + " -");
                            System.out.println("---------------------------------");
                            return;
                        }

		}
                
	}
        
        System.out.println("-----------------------");
        System.out.println("-     Invalid User    -");
        System.out.println("-----------------------");
    } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
	e.printStackTrace();
    }
  }

    }

