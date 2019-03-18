class JavaStaticVariable
{
    static int count=0;
    public void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        JavaStaticVariable obj1=new JavaStaticVariable();
        JavaStaticVariable obj2=new JavaStaticVariable();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
    }
}
