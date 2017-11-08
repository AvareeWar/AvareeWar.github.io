package com.company;

public class QuickSort extends Master{

    public int[] sortit;

    public void fix(int[] sortit){

        if(sortit == null || sortit.length == 0){
            return;
        }
        quickSort(0,sortit.length-1);
    }


    public void quickSort(int lowerbound, int upperbound){

        int l = lowerbound;
        int u = upperbound;
        int mid = sortit[lowerbound+(upperbound-lowerbound)/2];
        int pivot = sortit[mid];

        if(sortit == null || sortit.length == 0)
        {
            return;
        }
        while(l <= u){
            while(l < pivot) {
                l++;
            }
            while(l > pivot){
                passIt(l, u);
                l++;
                u++;
            }
        }
        if(lowerbound < u){
            quickSort(lowerbound, u);
        }
        if(l < upperbound){
            quickSort(l, upperbound);
        }
    }
}
