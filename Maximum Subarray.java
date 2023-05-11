import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;i++)
        {
            arr[i]=myObj.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            int count =0;
        for(int j=i; j<n ; j++)
        {
            
            count = count + arr[j];
            if(count > max)
            {
                max = count;
            }
        }
        }
        System.out.println(max);
        
    }
}
