import java.io.File;

public class ListOfDirectory {

    public static void main(String[] args){
        File file = new File("/Users/amanraj0/sqlserveroutput/inProgress/281abbb9-0eb9-11e9-953b-0000001e85f3");
        File[] files = file.listFiles(File::isDirectory);
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}
