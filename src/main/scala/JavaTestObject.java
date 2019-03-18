public class JavaTestObject {

    public static void main(String[] args) {

        String str = "abcd";
        ObjectTest objectTest = new ObjectTest();
        System.out.println(objectTest.sum(1,2));

    }


    public static class ObjectTest{

        public int sum(int a, int b){
            int x = a + b;
            return x;
        }

    }
}
