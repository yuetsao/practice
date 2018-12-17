package xmlParser;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XmlDoucumentHolder implements DocumentHolder {

    private Map<String, Document>  docs = new HashMap<String, Document>();


    @Override
    public Document getDocument(String filePath) {
        Document doc = this.docs.get(filePath);

        return null;
    }

    private Document readDocument(String filePath) {
        Document doc = null;
        SAXReader reader = new SAXReader();
        reader.setEntityResolver(new EntityResolver() {
            @Override
            public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
                return null;
            }
        });
        File xmlFile = new File(filePath);
        try {
            doc = reader.read(xmlFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
