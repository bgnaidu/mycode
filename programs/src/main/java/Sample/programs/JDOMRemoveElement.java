package Sample.programs;

import java.io.File;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

//RootElement().getChild("row").removeChild("address");
public class JDOMRemoveElement {
    public static void main(String[] args) {
        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(new File("C:\\cucumber\\Test.xml"));
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            
            doc.getRootElement();
          //  doc.detachRootElement();
            doc.removeContent(0);
       
            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}