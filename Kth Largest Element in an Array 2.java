import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = myObj.nextInt();
        }
        int k = myObj.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}
