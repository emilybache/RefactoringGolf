namespace ROUND_3_B;

public class Quick : Sorter
{
    protected override int[] DoSort(int[] input)
    {
        return Quicksort(input, 0, input.Length - 1);
    }

    private int[] Quicksort(int[] input, int left, int right) {
        int i = left, j = right;
        int pivot = input[(left + right) / 2];
        int k = i;
        while (k <= j) { 
            while (input[k] < pivot) 
                k++; 
            while (input[j] > pivot) 
                j--; 
            if (k <= j) { 
                Swap(input, k, j);
                k++;
                j--;
            } 
        }; 	       

        i = k;
        int index = i;
        if (left < index - 1){
            Quicksort(input, left, index - 1);
        }
        if (index < right){
            Quicksort(input, index, right);
        }
        return input;
    }
}