class Quick extends Sorter {
    @Override
    protected int[] doSort(int[] input) {
        return quicksort(input, 0, input.length - 1);
    }

    protected int[] quicksort(int[] input, int left, int right) {
        int i = left, j = right;
        int pivot = input[(left + right) / 2];
        int k = i;
        while (k <= j) {
            while (input[k] < pivot)
                k++;
            while (input[j] > pivot)
                j--;
            if (k <= j) {
                swap(input, k, j);
                k++;
                j--;
            }
        };

        i = k;
        int index = i;
        if (left < index - 1){
            quicksort(input, left, index - 1);
        }
        if (index < right){
            quicksort(input, index, right);
        }
        return input;
    }
}
