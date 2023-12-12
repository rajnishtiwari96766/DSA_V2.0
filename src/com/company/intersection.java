//find intersection of 2 arrays...
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class intersection {
    static int[] intersection1(int []arr1,int []arr2){
        int i=0,j=0;
        int []ans=new int[5];
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]==arr2[j]){
                ans[i]=arr1[i];
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []arr1=new int[5];
        for (int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        int []arr2=new int[5];
        for (int i=0;i< arr2.length;i++){
            arr2[i]= sc.nextInt();
        }

        System.out.println(Arrays.toString(intersection1(arr1, arr2)));
    }
}