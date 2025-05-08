import java.io.File;

public class InOutStreamDemo {
    public static void FileObject() {
        File file1 = new File("/home/stu_wxy/JavaPark/src/java-tutorial/javase/code/1.txt");
        System.out.println(file1);
        File file2 = new File("/home/stu_wxy/JavaPark/src/java-tutorial/javase/code", "1.txt");
        System.out.println(file2);
        File file3 = new File("/home/stu_wxy/JavaPark/src/java-tutorial/javase/code");
        File file4 = new File(file3, "1.txt");
        System.out.println(file4);
    }
    
    public static void main(String[] args) {
        
    }
}
