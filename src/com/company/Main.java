package com.company;

public class Main {

    public static void main(String[] args) {
        testSorting();
    }

    public static void testSorting(){
        QuickSort quickSort = new QuickSort();
        SimpleSorting simpleSorting = new SimpleSorting();

        int arr[] = new int[] {2,1,3,4,7,5,5};
        quickSort.test(arr);

        arr = new int[] {2,1,3,4,7,5,5};
        simpleSorting.bubbleSort(arr);

        arr = new int[] {2,1,3,4,7,5,5};
        simpleSorting.insertionSort(arr);
    }

    public static void testBFS(){
        BFS bfs =new BFS();
        bfs.test();
    }

    public static void testBinarySearch(){
        BinarySearching binarySearching =new BinarySearching();
        binarySearching.test();
    }
}
