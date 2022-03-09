package com.company;

public class BinarySearching {
    public void test(){
        int[] arr1 = new int[] {1,3,5,6,8,10,12,14,16,18};
        int[] arr2 = new int[] {1,3,5,5,8,10,10,14,16,19};

        System.out.print("arr1 : ");
        for(int a:arr1){
            System.out.print(a+",");
        }
        System.out.println();
        System.out.println("iterative = "+ iterative(arr1,4));
        System.out.println("recursive = "+ recursive(arr1,4,0,arr1.length-1));

        System.out.print("arr2 : ");
        for(int a:arr2){
            System.out.print(a+",");
        }
        System.out.println();
        System.out.println("iterative = "+ iterative(arr2,5));
        System.out.println("recursive = "+ recursive(arr2,5,0,arr2.length-1));

    }

    public int iterative(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;
        int mid;
        while (low <= high){
            mid = low +((high - low)/2);
            if(arr[mid] < x) low = mid +1;
            else if(arr[mid] > x) high = mid -1;
            else return mid;
        }
        return  -1;
    }

    public int recursive(int[] arr, int x,int low,int high){
        if(low > high) return -1;
        int mid = low +((high - low)/2);

        if(arr[mid] < x) return recursive(arr,x,mid+1,high);
        else if(arr[mid] > x) return recursive(arr,x,low,mid -1);
        else return mid;
    }
}
