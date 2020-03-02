public class sortOfSort {
    public void sortOfSort(int[] arr) {
        int greater = -1000;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (greater < arr[i]) {
                greater = arr[i];
            }
        }
    }
}

