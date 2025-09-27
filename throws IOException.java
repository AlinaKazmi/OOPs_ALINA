import java.io.*;   // for IOException and BufferedReader
import java.util.*;

class Demo {
    public static void main(String args[]) throws IOException {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int a, b, c;

        System.out.print("Enter 1st number: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter 2nd number: ");
        b = Integer.parseInt(br.readLine());

        c = a + b;

        System.out.println("Sum = " + c);
    }
}
