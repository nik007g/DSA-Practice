import java.util.*;

public class Main {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();

        ss.selectionSort(ss.arr);

        Arrays.stream(ss.arr).forEach(System.out::println);
    }

}