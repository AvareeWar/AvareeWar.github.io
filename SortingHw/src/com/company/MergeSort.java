package com.company;

import java.util.Arrays;

public class MergeSort extends Master{


    public int[] temp;
    public int i;


    public void mergeSort(int[] sortit, int lowerbound, int upperbound){
        int mid = sortit[(upperbound-lowerbound)/2];
        int[] leftside = Arrays.copyOfRange(sortit, 0, mid-1);
        int[] rightside = Arrays.copyOfRange(sortit, mid, sortit.length-1);

        int u = upperbound;
        int l = lowerbound;
        for(int i = 0; i < sortit.length-1; i++){
            if(sortit[i] == 0 || sortit == null) {
                return;
            }
        }

        while(l <= mid && mid <= u){
            if (leftside[l] <= leftside[u]) {
                System.out.println("Leftside before merge: " + leftside);
                System.out.println("Rightside before merge: " + rightside);
                temp[i] = leftside[l];
                System.out.println("Temp array after reassignment: " + temp + "<Leftside Assignment>");
            }
            else{
                System.out.println("Leftside before merge: " + leftside);
                System.out.println("Righside before merg: " + rightside);
                temp[i] = rightside[u];
                System.out.println("Temp array after reassignment: " + temp);
            }
        }
    }

    public void converge(int sortit[], int lowerbound, int upperbound)
    {
        if (lowerbound < upperbound)
        {
            int mid = (lowerbound+upperbound)/2;

            converge(sortit, lowerbound, mid);
            converge(sortit , mid + 1, upperbound);
            mergeSort(sortit, lowerbound, upperbound);
        }
    }
}
