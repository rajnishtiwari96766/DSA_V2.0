package com.company;

import java.util.Scanner;

public class bs_1 {
    static boolean b_search(int []arr,int key){
        int l=0,r= arr.length-1;
        int mid=(l+(r))/2;
        while (l<=r){

            if (arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                r=mid-1;
            }else {
                l=mid+1;
            }
            mid=(l+r)/2;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the array:");
        int []arr=new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("enter the key:");
        int key= sc.nextInt();

        System.out.println(b_search(arr,key));
    }
}
