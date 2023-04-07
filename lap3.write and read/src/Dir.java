import java.io.File;

public class Dir {
    static  void ListPath(File path){
        //get all files (or directories) in File path
        File[] files = path.listFiles();
        for (int i = 0 ; i < files.length; i ++){
            System.out.println(files[i].toString());
        }
    }

    public static void main(String[] args) {
        ListPath(new File("C:\\WINDOWS"));
    }
}
