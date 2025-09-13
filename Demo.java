import java.util.*;
class ThisDemo
{
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;

    }
    public void put();
    {
        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }

    class Demo
    {
        public static void main(String[] args)
        {
            ThisDemo object=new ThisDemo();
            object.get(10,20);
            object.put();

        }
    }
