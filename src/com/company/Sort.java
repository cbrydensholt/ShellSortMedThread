package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sort {

    public void sort(int arrayToSort[]) {
        int n = arrayToSort.length; //længden på array

        for (int gap = n / 2; gap > 0; gap /= 2) {    //gap er automatisk halvdelen af længen af array. efter hvert pass halveres vores gap og kører igen. til sidst er den 1.
            for (int i = gap; i < n; i++) { //
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap]; //her skifter den j position hvis j
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }

    //        int[] arraytosort = {55,232,100,500,1,23,26,29,69}; array eksempel
/* length = n (eksempel 9)
    now we have to find a gap not greater than n where
    gap = (n/2) (kaldes floor i dette eksempel)
    9/2 = 4.5
    floor = 4 (runder ned)
    gap = 4
    siden gap er 4 sammenlignes 55,1,69 - 232,26 f.eks.
    vi bytter rundt på de sammenlignede elementer hvis de ikke er sorterede (laveste skal være til venstre)
    vi sammenligner først 55 og 1. bytter rundt på 55 og 1. vi går ikke videre med 69 nu.
    nu kigger vi på næste gap gruppe. 232, 26.
    232 er større end 26, så vi bytter rundt på dem
    næste er 100 og 26, de byttes også rundt
    næste er 500 og 29. de byttes også rundt
    næste er 1 og 69. de bliver

    nu har vi gennemgået alle indekser og byttet rundt hvor det passer. Det var første "pass", altså gennemgang med et gap.

    nu er gap = floor(gap/2)
    gap var 4 før
    gap = (4/2) = 2
    gap = 2

    nu laver vi pass 2 med gap på 2 og gør det samme igen, bare med et andet gap. eksempel er med uforandret array.
    55,100,1,26,69
     vi gør dette igen for alle elementer.
        pass 2 er færdit, vi ændrer gap igen

        gap = (2/2) = 1
        nu checker vi hvert indesk med indekset ved siden af. Hvis et element byttes rundt, checker vi også elementet til venstre for at se om der skal byttes.
        hvis det også skal byttes rundt, checker vi elementet til venstre igen, sådan bliver det ved indtil det ikke skal byttes om på.




*/

public void generateArray(){

    int[] myArray = new int[1000];
    Random random = new Random();

    for(int i =0; i<myArray.length; i++  ){

            myArray[i] = random.nextInt();

        System.out.println(Arrays.toString(myArray));

    }

}

public int[] generateArray2(){

    Random random = new Random();

    int[] array = random.ints(1000000, 10,100000).toArray();


    System.out.println(Arrays.toString(array));
    System.out.println(array.length);

    return array;

}


}
