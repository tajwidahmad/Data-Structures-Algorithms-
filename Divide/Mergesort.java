package Divide;

public class Mergesort {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        merge_sort(arr, 0, arr.length-1);
        printarr(arr);
    }
    public static void merge_sort(int arr[],int si,int ei)  {
        
        // base case
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        //Divide
        //right part of the division
        merge_sort(arr, si, mid);
        //left part of the division
        merge_sort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }
    public static void Merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;//left traversing pointer
        int j=mid+1; // right traversing pointer
        int k=0; // to temp traversing
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
           
            }
            

        }
    
        //leftover left side elements
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        //left over right side elememts
        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;

        }
        // copy to original array
        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
        
    }
    
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        
        
    
}
