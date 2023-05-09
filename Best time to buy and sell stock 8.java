import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = myObj.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1; j<n;j++)
            {
                if(arr[j]-arr[i]>max)
                {
                    max = arr[j]-arr[i];
                }
                
            }
        }
        System.out.println(max);
            
    }
}
