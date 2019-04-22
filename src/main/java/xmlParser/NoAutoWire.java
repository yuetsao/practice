package xmlParser;

public class NoAutoWire implements AutoWire{

    String value;

    public NoAutoWire(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
