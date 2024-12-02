import java.io.*;
import java.util.*;

public class RemoveVowels
{        
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }

    static int count(String str)
    {
        int total= 0;
        for (int i = 0; i < str.length(); i++)
       
            if (isVowel(str.charAt(i)))
            ++total;
        return total;
    }
      
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.println(count(str));
    }
}