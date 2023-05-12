import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        
        for(int i=2; i<n ;i++)
        {
            int count =0;
            for(int j=1; j<n; j++)
            {
                
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count == 2 && n%i == 0)
            {
                System.out.printf(i+" ");
            }
        }
    }
}
