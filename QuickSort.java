import java.util.Random;

public class QuickSort {
    private final Random random= new Random();

    private int[] array;
    public QuickSort(int[] array) {
        this.array=array;
    }

    private void swap(int first, int second) {
        int a = array[first];
        array[first] = array[second];
        array[second] = a;
    }
    private int division(int start, int end){


        int  index = start + random.nextInt(end -start+1);
        int pillar = array[index];
        swap(end, index);
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pillar) {
                ++i;
                swap(i, j);
            }
        }
        swap((i+1), end);

        return (i+1);

    }



    public void quickSort(int start, int end){
        if(start<end){
            int pillar = division(start, end);
            quickSort(start, pillar - 1);
            quickSort(pillar + 1, end);
        }
    }
}
