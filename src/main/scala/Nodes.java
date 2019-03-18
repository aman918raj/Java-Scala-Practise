import javax.xml.soap.Node;
import java.util.LinkedList;

public class Nodes {

    public static void main(String[] args) {
        Nodes x = new Nodes(1,null);
        Nodes y = new Nodes(2,x);
        System.out.println(y.getNext().getData());
    }
    private int data;
    private Nodes next;
    
    public Nodes(int d, Nodes nx){
        data = d;
        next = nx;
    }

    public int getData(){
        return data;
    }

    public Nodes getNext(){
        return next;
    }

    public void setData(int d){
        data = d;
    }

    public void setNext(Nodes n){
        next = n;
    }
}
