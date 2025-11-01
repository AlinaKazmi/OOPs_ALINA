import java.io.*;
class byteArray1{
    public static void main(String[] args) {
        
        String s1 = new String("Alina");
        System.out.println("String using new keyword " + s1);
        String s2= new String("9alinakazmi@gmail.com");
        System.out.println("Email string:" + s2);

        byte[] byteArray = { 65,108,105,110,97 };
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);
        byte[] byteArray1={57,97,108,105,110,97,107,97,122,109,105,64,103,109,97,105,108,46,99,111,109};
        String str4 = new String(byteArray1);
        System.out.println("String from byte array: " + str4);
    }
}
