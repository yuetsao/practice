package colections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set,"A B C D E L".split(" "));
        set.add("M");

    }
}
