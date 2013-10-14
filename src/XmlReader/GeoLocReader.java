package XmlReader;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.LocatorImpl;

public class GeoLocReader implements ContentHandler {
	
	private Locator locator;
	
	public GeoLocReader() {
		super();
		locator = new LocatorImpl();
	}
	
	@Override
	public void setDocumentLocator(Locator value) {
		// TODO Auto-generated method stub
		locator = value;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Début de l'analyse du document");
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Fin de l'analyse du document");
		
	}
	
	@Override
	public void startPrefixMapping(String prefix, String URI) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Traitement de l'espace de nommage : " + URI + ", prefixe choisi : " + prefix);
	}
	
	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Fin de traitement de l'espace de nommage : " + prefix);
	}
	
	@Override
	public void startElement(String nameSpaceURI, String localName, String rawName, Attributes attributs) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Ouverture de la balise : " + localName);

        if ( ! "".equals(nameSpaceURI)) { // espace de nommage particulier
                System.out.println("  appartenant a l'espace de nom : "  + nameSpaceURI);
        }

        System.out.println("  Attributs de la balise : ");

        for (int index = 0; index < attributs.getLength(); index++) { // on parcourt la liste des attributs
                System.out.println("     - " +  attributs.getLocalName(index) + " = " + attributs.getValue(index));
        }
	}
	
	@Override
	public void endElement(String nameSpaceURI, String localName, String rawName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("Fermeture de la balise : " + localName);

        if ( ! "".equals(nameSpaceURI)) { // name space non null
                System.out.print("appartenant a l'espace de nommage : " + localName);
        }

        System.out.println();
	}
	
	@Override
	public void characters(char[] ch, int start, int end) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("#PCDATA : " + new String(ch, start, end));
	}

	

	@Override
	public void ignorableWhitespace(char[] ch, int start, int end)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("espaces inutiles rencontres : ..." + new String(ch, start, end) +  "...");
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("Instruction de fonctionnement : " + target);
        System.out.println("  dont les arguments sont : " + data);
	}

	@Override
	public void skippedEntity(String arg0) throws SAXException {
		// TODO Auto-generated method stub
		
	}
	
}