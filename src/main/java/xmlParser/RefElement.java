package xmlParser;

public class RefElement implements DataElement{

    private Object value;

    public  RefElement(Object value) {

        this.value=value;
    }

    @Override
    public String getType() {

        return "ref";
    }

    @Override
    public Object getValue() {

        return this.value;
    }
}
