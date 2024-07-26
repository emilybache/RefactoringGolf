namespace ROUND_3_B;

public abstract class Sorter
{
    public static int[] Sort(SortKind kind, int[] input)
    {
        return kind switch
        {
            SortKind.BUBBLE => new Bubble().DoSort(input),
            SortKind.QUICK => new Quick().DoSort(input),
            SortKind.INSERTION => new Insertion().DoSort(input),
            _ => throw new ArgumentException($"Unknown sort kind '{kind}'", nameof(kind))
        };
    }

    protected abstract int[] DoSort(int[] input);

    protected void Swap(int[] input, int index1, int index2) {
        int first = input[index1];
        int second = input[index2];
        input[index1] = second;
        input[index2] = first;
    }
}