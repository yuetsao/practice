package iotest;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        copy("/Users/caoyue/workspaces/practice/src/thinking.Adventure.java", "/Users/caoyue/workspaces/practice/src/Adventure1.java");
    }

    public static void copy(String srcPath, String destPath) {

        File src = new File(srcPath);
        File dest = new File(destPath);
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte [] flush = new byte[1024];
            int len = -1;
            while((len=is.read(flush))!=-1) {
                os.write(flush, 0, len);
            }
            os.flush();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void copy2(String srcPath, String destPath) {
        File src = new File(srcPath);
        File dest = new File(destPath);
        try(InputStream inputStream = new FileInputStream(src);
            OutputStream outputStream = new FileOutputStream(dest);) {
            byte [] flush = new byte[1024];
            int len = -1;
            while((len = inputStream.read(flush)) != -1) {
                outputStream.write(flush, 0, len);
            }
            outputStream.flush();
        }catch (FileNotFoundException e) {
            System.out.println("文件没有找到");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("流错误");
            e.printStackTrace();
        }
    }

}
