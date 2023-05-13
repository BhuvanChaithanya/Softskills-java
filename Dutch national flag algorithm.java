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
        Arrays.sort(arr);
        for(int i=0; i<n ; i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
