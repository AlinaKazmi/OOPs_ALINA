class Geeks {
    String name;
    int id;
    Geeks (String name, int id )
    {
        this.name=name;
        this.id=id;

    }
}
class GFG
{
    public static void main(String[] args)
    {
        Geeks geek1=new Geeks("Alina",111);
        
            System.out.println("GeekName:" + geek1.name +" and GeekID:" + geek1.id);
        
    }
}
