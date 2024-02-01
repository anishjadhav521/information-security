import com.sun.org.apache.xpath.internal.functions.FuncStringLength;

import java.sql.SQLOutput;
import java.util.Scanner;

public class encryption {

    private static char h;

    public static void main (String[] args) {

        System.out.println("enter your string");
        Scanner input = new Scanner(System.in);
        String j = input.nextLine();

        int key = 4;

        int i = 0;
        String y = null;
        char[] arr = new char[j.length()];


        for (i = 0; i < j.length(); i++) {


            if(j.charAt(i)==' ')
            {
                //j.replace(' ','x');
                arr[i] = 'X';
            }
            else {
                char c = j.charAt(i);
                int a = (int) c;
                a = a + 4;

                char k = (char) a;
                arr[i] = k;
            }
        }

        System.out.println(arr);

    }
}