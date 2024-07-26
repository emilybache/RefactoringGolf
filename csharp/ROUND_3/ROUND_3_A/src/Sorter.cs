namespace ROUND_3_A;

public class Sorter
{
    public int[] Sort(SortKind kind, int[] input)
    {
        switch(kind){
            case SortKind.BUBBLE:
                bool sorted = false;
                while(!sorted){
                    sorted = true;
                    for (int i = 0; i < input.Length - 1; i++) {
                        if(input[i] > input[i+1]){
                            Swap(input, i, i+1);
                            sorted = false;
                        }
                    }
                }
                break;
            case SortKind.QUICK:
                input = Quicksort(input, 0, input.Length - 1);
                break;
            case SortKind.INSERTION:
                for (int i = 0; i < input.Length - 1; i++) {
                    for(int j = i+1;j > 0;j--){
                        if(input[j] < input[j-1]){
                            Swap(input, j, j-1);
                        }
                    }
                }
                break;
        }
        return input;
    }
    
    private void Swap(int[] input, int index1, int index2) {
        int first = input[index1];
        int second = input[index2];
        input[index1] = second;
        input[index2] = first;
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