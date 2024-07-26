namespace ROUND_1_A.Tests;

public class FibonacciIndex
{
    [TestCase(0,0)]
    [TestCase(1,1)]
    [TestCase(3,2)]
    [TestCase(4,3)]
    [TestCase(5,5)]
    [TestCase(6,8)]
    [TestCase(7,13)]
    [TestCase(8,21)]
    [TestCase(49, 7778742049L)]
    public void FindsIndexOfFibonacciNumber(int expectedIndex, long fibonacci)
    {
        Assert.That(FindIndexOf(fibonacci), Is.EqualTo(expectedIndex));
    }
    
    [Test]
    public void WhenNumberNotFoundThenIndexIsMinusOne()
    {
        Assert.That(FindIndexOf(7), Is.EqualTo(-1));
    }
    
    [Test]
    public void CannotFindIndexOfNegativeNumber()
    {
        Assert.That(FindIndexOf(-1), Is.EqualTo(-1));
    }

    private int FindIndexOf(long fibonacci)
    {
        if (fibonacci >= 0 && fibonacci < 2)
        {
            return (int)fibonacci;
        }

        int indexOfFibonacci = -1;
        int currentIndex = 2;
        long f = 0;
        List<long> sequence = [0, 1];
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
}