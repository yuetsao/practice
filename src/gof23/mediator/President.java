package gof23.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {
    private Map<String, Department> map = new HashMap<String, Department>();
    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void commond(String dname) {
        map.get(dname).selfAction();
        map.get(dname).outAction();
    }

}
