package com.practise;

class Parent
{
    int a=100;
    public void display()
    {
        System.out.println("Display in parent A: "+a);
    }
}

class Child extends Parent
{
    int b=200;

    public void display()
    {
        System.out.println("Display in parent B: "+b);
    }
}

class Test
{
    public static void main(String args[])
    {
        Parent obj = new Child();
        obj.display();
    }
}
