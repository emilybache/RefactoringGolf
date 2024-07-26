namespace ROUND_3_B;

public class Bubble : Sorter
{
    protected override int[] DoSort(int[] input)
    {
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
        return input;
    }
}