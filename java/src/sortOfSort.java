public class sortOfSort {
    public static void sortOfSort(int[] arr, int index, int length, int count) {
        int temp;
        int prev;

        if(index > length){return;}

        if(count%2==0){
            for(int i = index+1; i < length; i++){
                temp = arr[i];
                prev = i-1;
                while (prev>=0 && arr[prev] > temp){
                    arr[prev+1] = arr[prev];
                    prev = prev -1;
                }
                arr[prev+1]= temp;
            }
            sortOfSort(arr, index, length-2, count+1);
        }

        if(count%2==1){
            for(int i = index+1; i < length; i++){
                temp = arr[i];
                prev = i-1;
                while (prev>=0 && arr[prev] < temp){
                    arr[prev+1] = arr[prev];
                    prev = prev -1;
                }
                arr[prev+1]= temp;
            }
            sortOfSort(arr, index+2, length, count+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,8,7,5};
        sortOfSort(arr, 0, arr.length,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}