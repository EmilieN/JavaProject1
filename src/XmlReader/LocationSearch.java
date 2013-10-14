package XmlReader;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class LocationSearch {
	
	protected String key;
	protected String secret;
	
	public LocationSearch() {
		
		try {
			XMLReader saxReader = XMLReaderFactory.createXMLReader();
			GeoLocReader lr = new GeoLocReader();
			saxReader.setContentHandler(lr);
			saxReader.parse("geoloc.xml");
			key = lr.getKey();
			secret = lr.getSecret();
		}
		catch(SAXException se) {
			se.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}