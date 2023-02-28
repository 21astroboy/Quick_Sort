import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[5];
        for(int i = 0; i < array.length;i++){
            array[i] = random.nextInt(21);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        QuickSort quickSort = new QuickSort(array);
        quickSort.quickSort(0, array.length-1);
        for ( int el: array) {
            System.out.print(el+" ");
        }
    }
}