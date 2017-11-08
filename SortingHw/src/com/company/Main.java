package com.company;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.List;

public class Main {



    public static void main(String[] args) {
        // write your code here

        Master master = new Master();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();


        int[] sortedList = new int[] {1,2,3,4,5,6,7,8,9};
        int[] unsortedList = new int[] {2,3,4,53,9,33,22,1,5};
        int[] emptyList = new int[] {};

        //-----------------------------------------------------------------------------------------
        System.out.println("Test Lists that have yet to be put into sorting functions: " + "\n" +
                "---------------------------------------------------------------------------");

        System.out.print("Sorted Array: ");
        master.runList(sortedList);

        System.out.print("Unsorted Array: ");
        master.runList(unsortedList);

        System.out.print("Empty Array: ");
        master.runList(emptyList);

        System.out.println("---------------------------------------------------------------------------");
        //----------------------------------------------------------------------------------------
        //QUICKSORT TESTING

        System.out.println("Tests against <QUICKSORT>");
        //quickSort.fix(unsortedList);

        System.out.println("---------------------------------------------------------------------------");
        //----------------------------------------------------------------------------------------
        //MERGESORT TESTING

        System.out.println("Tests agains <MERGESORT>");
        mergeSort.converge(unsortedList, 2,5);








    }

}
