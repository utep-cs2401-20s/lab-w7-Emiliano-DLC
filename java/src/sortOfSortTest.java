import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortOfSortTest {
    //Test a simple array to see if works properly on a short array.
    @Test
    public void sortOfSort1(){
        sortOfSort test = new sortOfSort();
        int[] arr = {3,4,8,7};
        test.sortOfSort(arr, 0, arr.length,0);
        assertArrayEquals(new int[]{4,3,7,8}, arr);

    }

    //Sort the characters by its ascii value
    @Test
    public void sortOfSort2(){
        sortOfSort test = new sortOfSort();
        int[] arr = {'a','b','c','d'};
        test.sortOfSort(arr, 0, arr.length,0);
        assertArrayEquals(new int[]{'b','a','c','d'}, arr);

    }

    //Uses a long array to sort a long array to see if works properly.
    @Test
    public void sortOfSort3(){
        sortOfSort test = new sortOfSort();
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        test.sortOfSort(arr, 0, arr.length,0);
        assertArrayEquals(new int[]{7,6,3,2,0,1,4,5,8,9}, arr);

    }

    // Takes a string and on an array put each character in the array.
    //using a string of five characters is sorted by using the ascii values of each char
    @Test
    public void sortOfSort4(){
        sortOfSort test = new sortOfSort();
        String x = "hello";
        int[] arr = new int[x.length()];
        for(int i = 0; i<x.length(); i++){
            arr[i] = x.charAt(i);
        }
        test.sortOfSort(arr, 0, arr.length,0);
        assertArrayEquals(new int[]{'l','h','e','l','o'}, arr);

    }

    //Test an array that mix integers and characters to see how the method handle
    //different data types.
    @Test
    public void sortOfSort5() {
        sortOfSort test = new sortOfSort();
        int[] arr = {1, 'd', 3, 'z', 6};
        test.sortOfSort(arr, 0, arr.length, 0);
        assertArrayEquals(new int[]{6, 3, 1, 'd', 'z'}, arr);
    }

}