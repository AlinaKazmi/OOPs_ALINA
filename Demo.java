import java.util.*;
class ThisDemo
{
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;

    }
}
    class Demo{
        public static void main(String[] args)
        {
            ThisDemo object=new ThisDemo();
            object.get(10,20);
            object.put();

        }
    }
