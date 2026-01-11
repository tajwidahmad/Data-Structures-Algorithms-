package Divide;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        String arr[]= { "sun", "earth", "mars", "mercury"};
        quick(arr, 0, arr.length-1);
        printarr(arr);
        
        
    }
    public static void quick(String arr[],int si,int ei) {
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        // left
        quick(arr, si, mid);
        //right
        quick(arr, mid+1, ei);
        // merge
        Merge(arr,si,mid,ei);
        
    }
    public static void Merge(String arr[],int si,int mid,int ei) {
        String temp[]=new String[ei-si+1];
        // iterator for left
        int i=si;
         // iterator for right
        int j=mid+1;
         // iterator for temp array...
        int k=0;
        while(i<=mid && j<=ei){
            if (arr[i].compareTo(arr[j])<0) {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        //left over string at left side
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;


        }
        while(j<=ei){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void printarr(String arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
