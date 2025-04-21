
public class SelectionSort {

    public int []arr = {3,1,5,4,9,0};

    public void selectionSort(int[] arr){

        for(int i = 0; i< arr.length-1; i++){
            int smallest_number_index = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[smallest_number_index]){
                    smallest_number_index = j;
                }
            }
            int temp_number = arr[i];
            arr[i] = arr[smallest_number_index];
            arr[smallest_number_index] = temp_number;
        }
    }

}
