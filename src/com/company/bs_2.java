//find the  first and the last index of the key...
package com.company;

import java.util.Scanner;

public class bs_2 {
    static void position(int []arr,int key){
        int start=-1,end=-1,l=0,r=arr.length-1;
        int mid=l+(r-l)/2;

        while(l<r){
            if(arr[mid]==key){
                start=mid;
                end=mid;
                break;
            }
            else if (arr[mid]>key){
                r=mid-1;
            }else if(arr[mid]<key){
                l=mid+1;
            }
        }

        while(start>0 && arr[mid-1]==key){
            start--;
        }

        while (end<= arr.length-1 && arr[mid+1]==key){
            end++;
        }

        System.out.println(start);
        System.out.println(end);


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

        position(arr,key);
    }
}