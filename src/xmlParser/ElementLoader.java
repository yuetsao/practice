package xmlParser;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Collection;

public interface ElementLoader {
    void addElement(Document document);
    Element getElement(String id);
    Collection<Element> getElements();
}
