package task_3;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = dbf.newDocumentBuilder();
//        Document document = builder.parse(new File("src\\task_3\\flower.xml"));
//        dbf.setIgnoringElementContentWhitespace(true);
//        Element element = document.getDocumentElement();
//        NodeList list = element.getElementsByTagName("flower");
//
//        for (int i = 0; i < list.getLength(); i++) {
//            Node node = list.item(i);
//            System.out.println(element.getElementsByTagName("name").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("soil").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("origin").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("stem_color").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("leaf_color").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("size").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("temperature_celsius").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("lighting").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("watering_milliliters").item(i).getFirstChild().getTextContent());
//            System.out.println(element.getElementsByTagName("multiplying").item(i).getFirstChild().getTextContent());
//        }
//    }
// --------------------------------------------використання регулярних виразів----------------------

            File  file = new File ( "src\\task_3\\flower.xml" );
            try  (BufferedReader br = new  BufferedReader ( new FileReader( file ))) {
                StringBuilder str = new StringBuilder();
                int  i ;
                for (; ;) {
                    i = br.read();
                    if ( i == - 1 )
                        break ;
                    str.append((char) i);
                }
                Pattern  p = Pattern. compile ( ">(.*)<" , Pattern . CASE_INSENSITIVE | Pattern . UNICODE_CASE );
                Matcher m = p.matcher (str.toString());
                while ( m.find ()) {
                    System.out.println( m.group (1));

                }
            } catch ( IOException  e ) {
                e . printStackTrace ();
            }
        }

}

