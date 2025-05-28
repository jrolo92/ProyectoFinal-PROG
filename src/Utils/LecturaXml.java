package Utils;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LecturaXml {
    public static void main(String[] args) {
        try {
            File xml = new File("C:\\Users\\usuario\\Documents\\1 DAW\\PROGRAMACIÓN\\Proyecto Final\\src\\Ficheros\\persona.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xml);

            document.getDocumentElement().normalize();

            System.out.println("Elemento raíz: " + document.getDocumentElement().getNodeName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}