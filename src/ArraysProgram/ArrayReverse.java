package ArraysProgram;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayReverse {

	public static void reverseArrayToFrom(int[] a, int start, int end) {

//		if (start > end)
//			return;
		int temp;

//		temp = a[start];
//		a[start] = a[end];
//		a[end] = temp;
//		reverseArrayToFrom(a, start + 1, end - 1);


		int n = a.length;
		for (int j=0;j<n/2;j++){
			temp = a[j];
			a[j] = a[n-(j+1)];
			a[n-(j+1)] = temp;
		}

	}


    public static void main(String[] args) throws IOException {
    	int []arr= {1,2,3,4,5,8,9,7};
    	reverseArrayToFrom(arr,0,arr.length-1);
    	for(int t:arr)
    		System.out.print(t+" ");
       
    }
}
