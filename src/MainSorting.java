/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maspa
 */
public class MainSorting {

    public static void main(String[] args) {
        //quick sort
        int i;
        int[] arr1 = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        QuickSort.quickSort(arr1, 0, 9);
        System.out.println("\n The sorted array is: \n");
        for (i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }
        
        //merge sort
        int arr2[] = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        MergeSort ob = new MergeSort();
        ob.sort(arr2, 0, arr2.length - 1);

        System.out.println("\nSorted array");
        for (int j = 0; j < arr2.length; i++) {
            System.out.println(arr2[i] + "");
        }
    }
}
