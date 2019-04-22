package iotest;

import java.io.File;

/**
 * 统计文件夹的大小
 */
public class DirCount {
    private long len;//总共的大小
    private String path;//文件的路径
    private int filesNum;//文件的数量
    private int dirsNum;//文件夹的数量
    File src;//源头
    public DirCount(String path) {
        this.path = path;
        this.src = new File(path);
        this.count(src);
    }

    public void count(File file) {
        if(null != file && file.exists()) {
            if(file.isFile()) {//如果file是一个文件就直接将文件的长度加上
                len += file.length();
                this.filesNum++;
            }else if(file.isDirectory()) {
                dirsNum ++;
                for(File f: file.listFiles()) {
                    count(f);
                }
            }
        }
    }

    /**
     * 操作流的四个步骤：
     * 1确定源
     * 2选择流
     * 3操作
     * 4释放
     * @param args
     */
    public static void main(String[] args) {
        DirCount dirCount = new DirCount("/Users/caoyue/workspaces");
        System.out.println("文件夹数量为："+dirCount.getDirsNum() + "\n"+ "文件夹大小为："+ dirCount.getLen() + "\n"+ "文件数量为："+ dirCount.filesNum);
    }

    public long getLen() {
        return len;
    }

    public void setLen(long len) {
        this.len = len;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getFilesNum() {
        return filesNum;
    }

    public void setFilesNum(int filesNum) {
        this.filesNum = filesNum;
    }

    public int getDirsNum() {
        return dirsNum;
    }

    public void setDirsNum(int dirsNum) {
        this.dirsNum = dirsNum;
    }
}
