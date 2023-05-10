import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        
        for(int j=2; j<=n ;j++)
        {
            int count =0;
        for(int  i=1; i*i<=j ; i++)
        {
            if(j%i ==0)
            {
                count++;
            }
        }
        if(count == 1)
        {
            
            System.out.printf("%d ",j);
        }
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
