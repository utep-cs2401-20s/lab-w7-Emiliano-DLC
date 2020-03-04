public class sortOfSort {
    public static void sortOfSort(int[] arr) {
        int index;
        int temp;
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            index = i;
            for (int k = i - 1; k >= 0; k--) {
                if (arr[k] > arr[index] && (count == 0 || count == 1)) {
                    index = k;
                }
                if (arr[k] < arr[index] && count>2) {
                    index = k;
                }
                if (arr[k] > arr[index] && count>2) {
                    index = k;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            count++;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4,7,8};
        sortOfSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

  /*  int firstValue;
    int prevItem;
    //Bubble sort
        for(int k = 0; k<arr.length;k++) {
        for (int i = 0; i < arr.length - 1; i++) {
            firstValue = arr[i];
            prevItem = arr[i + 1];
            if (firstValue >= prevItem) {
                if(i%2==1) {
                    arr[i + 1] = firstValue;
                    arr[i] = prevItem;
                }
            }
        }
    }

}*/