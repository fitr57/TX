/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author d.gagliano
 */
public class CreateXML {

    private String namefile;
    private String nameContainer;
    //public Map<String,String> elements = new HashMap <String, String>();
    ArrayList<ElementInterno> elementsList = new ArrayList();
    public String attrCont_type ;
    public String attrCont_cont;

    public CreateXML(){}
    public CreateXML(String namfile,String nameCont){
        
        this.namefile = namfile; 
        this.nameContainer = nameCont;   
    }
    
    
    /**
     * @return the namefile
     */
    public String getNamefile() {
        return namefile;
    }

    /**
     * @param namefile the namefile to set
     */
    public void setNamefile(String namefile) {
        this.namefile = namefile;
    }

    /**
     * @return the nameContainer
     */
    public String getNameContainer() {
        return nameContainer;
    }

    /**
     * @param nameContainer the nameContainer to set
     */
    public void setNameContainer(String nameContainer) {
        this.nameContainer = nameContainer;
    }

    public void addElementss(String c, String v){ 
        this.elementsList.add(new ElementInterno(c,v));
    }
    
    public void function_createXML()throws Exception{
        
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      
      DocumentBuilder documetBuilder = documentBuilderFactory.newDocumentBuilder();
      
      Document document = documetBuilder.newDocument();
      
      Element element = document.createElement(getNameContainer());
      
      document.appendChild(element);
      
      Attr attr = document.createAttribute(this.attrCont_type);
      attr.setValue(this.attrCont_cont);
      
      element.setAttributeNode(attr);
      
      for(int i = 0; i < this.elementsList.size(); i ++){
                 /* elementi */
        Element name = document.createElement(this.elementsList.get(i).c);
        name.appendChild(document.createTextNode(this.elementsList.get(i).v));
        element.appendChild(name);
      }
      
       TransformerFactory transformerFactory = TransformerFactory.newInstance();
       Transformer transformer = transformerFactory.newTransformer();
       
       DOMSource source = new DOMSource(document);
       StreamResult streamResult = new StreamResult(new File("C:\\XML\\"+namefile+".xml"));
       
       transformer.transform(source, streamResult);
      
    }

}
