public class LinearSearch {

    private int arr[] = {3,4,1,3,56,78};

    // This method will find first occurance of the element in max O(n) time complexity
    private int searchElement(int[] arr, int element){
        for(var i = 0; i< arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void call(){
        int index =  this.searchElement(arr, 4);
        if(index == -1){
            System.out.println("element not found");
        }
        else{
            System.out.printf("element found at index %d%n", index);
        }
    }
}
