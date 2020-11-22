package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Sort sort = new Sort();

        long start = System.currentTimeMillis();

        int[] arrayToSort = sort.generateArray2();

        //sort.sort(arrayToSort);

        Thread t1 = new Thread(new Runnable() { //med thread kører den omkring dobbelt så hurtigt. 500ms til 260ms
            public void run() {
                sort.sort(arrayToSort);
                System.out.println("thread kører her"); }});

        t1.start();
        long end = System.currentTimeMillis();

        System.out.println(end-start + " is run time");



        //System.out.println(Arrays.toString(arraytosort));



    }





}
