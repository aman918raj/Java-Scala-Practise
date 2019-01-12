import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class JavaEnum {

    enum DataTypeDB{
        BLOB(2004),CLOB(2005);

        private int valueType;

        public int getValueType(){
            return this.valueType;
        }

        private DataTypeDB(int valueType){
            this.valueType = valueType;
        }
    }

    public static void main(String[] args){

       /* List<Integer> configTypeValues = new ArrayList<Integer>();
        configTypeValues.add(5);
        configTypeValues.add(2);
        if(!configTypeValues.contains(5)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }*/

       /* DataTypeDB[] types = DataTypeDB.values();
        List<String> unsupportedList = new ArrayList<String>();
        unsupportedList.add("BLOB");
        List<String> colType = new

        for(DataTypeDB type : types){
            if(!unsupportedList.contains(type.name())){

            }
        }

        System.out.println(types);*/

        List<String> columnList = new ArrayList<String>();
        List<String> outputFields = new ArrayList<String>();
        outputFields.add("col1");
        outputFields.add("col2");
        StringJoiner sj = new StringJoiner(",");
        outputFields.stream().forEach(e -> sj.add(e));
        StringJoiner query = new StringJoiner(" ");
        query.add("select").add(sj.toString()).add("from").add("table");
        System.out.println(query.toString());


    }

}
