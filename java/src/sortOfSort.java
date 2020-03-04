public class sortOfSort {
    public static void sortOfSort(int[] arr) {
        int firstValue;
        int prevItem;
        int temp;

        for (int i = 1; i < arr.length-1; i++) {
            firstValue = arr[i];
            prevItem = arr[i+1];
            if(firstValue >= prevItem){
                //temp = firstValue;
                arr[i+1] = firstValue;
                arr[i] = prevItem;
            }
        }

    }
    public static void main(String[] args){
        int[] arr = {2,3,4,8,1,7,9,3,1};
        sortOfSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

