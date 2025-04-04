namespace ROUND_1_B;

public class FibonacciIndexer
{
    public int FindIndexOf(long fibonacci)
    {
        if (fibonacci >= 0 && fibonacci < 2)
        {
            return (int)fibonacci;
        }

        return Seek(fibonacci);
    }

    private static int Seek(long fibonacci)
    {
        int indexOfFibonacci = -1;
        int currentIndex = 2;
        long f = 0;
        List<long> sequence = BuildInitialSequence();
        while (f < fibonacci)
        {
            f = sequence[currentIndex - 1] + sequence[currentIndex - 2];
            if (f == fibonacci)
                indexOfFibonacci = currentIndex;
            sequence.Add(f);
            currentIndex++;
        }
        
        return indexOfFibonacci;
    }

    private static List<long> BuildInitialSequence()
    {
        return [0, 1];
    }
}