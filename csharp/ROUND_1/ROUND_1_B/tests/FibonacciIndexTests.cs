namespace ROUND_1_B.Tests;

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
        return new FibonacciIndexer().FindIndexOf(fibonacci);
    }
}