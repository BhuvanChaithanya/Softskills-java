import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int i=2;
        while(n != 1 && i<=n)
        {
            if(n%i == 0)
            {
                n = n/i;
                System.out.printf(i+" ");
            }
            else
            {
                i++;
            }
        }
        
    }
}
