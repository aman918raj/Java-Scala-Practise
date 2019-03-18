import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFilew{
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/dhgdj/bka");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){

            if(line.contains("Chaitanya")){
                //line.r
            }
            br.readLine();
        }
        br.close();
    }
}
