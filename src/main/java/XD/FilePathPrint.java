package XD;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilePathPrint {
    public static void main(String[] args) {
        List<String> paths = new ArrayList<>();
        getAllFilePaths(new File("/Users/caoyue/practice"), paths);
        System.out.println(paths);
    }

    public static void getAllFilePaths(File filePath, List<String> paths) {
        File [] files = filePath.listFiles();
        if(files == null) {
            return;
        }
        for(File file: files) {
            if(file.isDirectory()) {
                paths.add(file.getPath());
                getAllFilePaths(file, paths);
            }else {
                paths.add(file.getPath());
            }
        }
    }
}
