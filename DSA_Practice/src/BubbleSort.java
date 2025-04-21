import java.util.*;

public class BubbleSort {

    private int[] arr = {10,3,4,1,0,9};

    private void bubbleSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length - i- 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void call(){
        this.bubbleSort(arr);
        System.out.println("Sorted Elements:");
        Arrays.stream(arr).forEach(System.out::println);
    }

}
