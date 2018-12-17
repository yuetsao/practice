package xmlParser;

import org.dom4j.Document;

public interface DocumentHolder {
    Document getDocument( String filePath);
}
