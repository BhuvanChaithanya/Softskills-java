import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int m = myObj.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                arr[i][j] = myObj.nextInt();
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int i = n-1;i>=0;i--)
            {
                System.out.printf("%d ",arr[i][j]);
            }
        }
    }
}
