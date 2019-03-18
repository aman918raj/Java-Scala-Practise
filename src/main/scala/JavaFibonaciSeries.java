public class JavaFibonaciSeries {
    int length = 10;
    public static void main(String[] args){

        int x;
        int initilValue = 0;
        int nextValue = 1;
        for (int i = 1; i <= 10; i++){
            System.out.println(initilValue);
            x = initilValue;
            initilValue = nextValue;
            nextValue = x + nextValue;
        }
    }
}
