public class sortOfSort {
    public void sortOfSort(int[] arr) {
        int firstValue;
        int nextItem;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            firstValue = arr[i];
            nextItem = arr[i+1];
            if(firstValue<nextItem){
                temp = firstValue;
                firstValue = nextItem;
                nextItem = temp;
            }
        }

    }
    public void main(String[] args){
        int[] arr = {2,3,4,8,1,7,9,3,1};
        sortOfSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr);
        }
    }
}

