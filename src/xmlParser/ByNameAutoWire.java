package xmlParser;

public class ByNameAutoWire implements AutoWire{

    private String value;

    public ByNameAutoWire(String value) {

        this.value = value;
    }

    @Override
    public String getValue() {

        return value;
    }

}