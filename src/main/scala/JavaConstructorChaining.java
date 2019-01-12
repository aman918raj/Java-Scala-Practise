public class JavaConstructorChaining {

    String name;
    int id;
    public JavaConstructorChaining(){
        this(123);
    }

    public JavaConstructorChaining(int id){
        this(id, "Aman");
    }

    public JavaConstructorChaining(int id1, String name1){
        this.id = id1;
        this.name = name1;
    }

    public static void main(String[] args){

        JavaConstructorChaining javaConstructorChaining = new JavaConstructorChaining();
        System.out.println(javaConstructorChaining.id + javaConstructorChaining.name);
        System.out.println(javaConstructorChaining.name);
    }
}
