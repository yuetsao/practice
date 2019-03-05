import java.util.ArrayList;
import java.util.List;

public class GenerateCharSort {
    public static void main(String[] args) {
        List<String> charSort = getColumnList();
        System.out.println(charSort);
    }

    public static List<String> getColumnList() {
        List<String> columnList = new ArrayList<String>();
        char[] abc = new char[26];
        for (int k = 0; k < abc.length; k++) {
            abc[k] = (char) ('A' + k);
        }
        for (int k = 0; k < 3; k++) {
            String x = (k > 0 ? abc[k - 1] + "" : "");
            for (char anAbc : abc) {
                columnList.add(x + anAbc);
            }
        }
        return columnList;
    }
}
