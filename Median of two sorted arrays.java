import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n1 = myObj.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i] = myObj.nextInt();
        }
        int n2 = myObj.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = myObj.nextInt();
        }
        int[] arr3 = new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            arr3[i] = arr1[i];
        }
        for(int i=n1;i<n1+n2;i++)
        {
            arr3[i] = arr2[i-n1];
        }
        Arrays.sort(arr3);
        if((n1+n2)%2==1)
        {   
            float a = arr3[(n1+n2)/2];
            System.out.println(a);
        }
        else
        {
            float x = arr3[((n1+n2)/2)-1];
            float y = arr3[((n1+n2)/2)];
            System.out.println((x+y)/2);
        }
    }
}
