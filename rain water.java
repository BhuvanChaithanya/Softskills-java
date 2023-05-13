import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = myObj.nextInt();
        }
        int rain_filled =0;
        for(int i=1; i<n-1 ; i++)
        {
            int maxl = arr[i];
            for(int j=0 ; j<i ; j++)
            {
                maxl = Math.max(maxl, arr[j]);
            }
            int maxr = arr[i];
            for(int j = i+1; j<n ; j++)
            {
                maxr = Math.max(maxr,arr[j]);
            }
            int x = Math.min(maxl,maxr);
            rain_filled = rain_filled + (x- arr[i]);
        }
        System.out.println(rain_filled);
    }
}
