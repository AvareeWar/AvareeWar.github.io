package com.company;

public class Master {

    int lowerbound;
    int upperbound;
    int[] array;
    int[] List;


    public Master(){
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
        this.array = array;
    }

    public void passIt(int lowerbound, int upperbound) {
        int l = lowerbound;
        int u = upperbound;
        int temp = List[l];
        List[l] = List[u];
        List[u] = temp;
    }

    public void runList(int[] array)
    {
        for (int i = 0; i < array.length-1; i++)
        {
            System.out.print(i + ",");
        }
        System.out.println("\n");
    }

}
