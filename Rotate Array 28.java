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
        int r = myObj.nextInt();
        r = r%n;//after every n rotaions the array returns to same position
        
        int rn = r+n;
        int[] arr2 = new int[rn];
        for(int j=r; j<rn;j++)
        {
            arr2[j] = arr [j-r]; 
        }
        for(int i=0;i<r;i++)
        {
            arr2[i] = arr[n-r+i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr2[i]);
        }
    }
}
