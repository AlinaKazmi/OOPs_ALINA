class SuperClass{

{
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;

    }
}
    class SubClass extends SuperClass
    { int a,b;
        public void get()
        {
            this.a=super.a;
            this.b=super.b;

        }
        public void put()
        {
            System.out.println("a="+a);
            System.out.println("b="+b);
        }
        class Demo{
        public static void main(String[] args)
        {
            SubClass object=new SubClass();
            object.get(10,20);
            object.get();
            object.put();

        }
    }











}
