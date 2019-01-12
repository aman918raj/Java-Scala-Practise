public class JavaConstructorExample {

    String id;

    public JavaConstructorExample(){
        this.id = "abcd1234";
    }

    public JavaConstructorExample(String nextId){
        this.id = nextId;
    }

    public static void main(String[] args){

        JavaConstructorExample javaConstructorExample = new JavaConstructorExample();
        System.out.println(javaConstructorExample.id);
        JavaConstructorExample javaConstructorExample1 = new JavaConstructorExample("xyz123");
        System.out.println(javaConstructorExample1.id);
    }
}
