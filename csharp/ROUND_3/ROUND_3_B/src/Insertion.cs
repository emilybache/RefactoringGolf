namespace ROUND_3_B;

public class Insertion : Sorter
{
    protected override int[] DoSort(int[] input)
    {
        for (int i = 0; i < input.Length - 1; i++) {
            for(int j = i+1;j > 0;j--){
                if(input[j] < input[j-1]){
                    Swap(input, j, j-1);
                }
            }
        }

        return input;
    }
}