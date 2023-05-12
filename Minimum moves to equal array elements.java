import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++)
        {
            arr[i] = myObj.nextInt();
        }
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            int count =0;
        for(int j=0;j<n;j++)
        {
            count += Math.abs(arr[i]-arr[j]);
            
        }
            ans[i] = count;
        }
        Arrays.sort(ans);
        System.out.println(ans[0]);
            
        
    }
}
