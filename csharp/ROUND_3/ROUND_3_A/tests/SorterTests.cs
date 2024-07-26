namespace ROUND_3_A.Tests;

public class SorterTests
{
    private static readonly int[] SortedArray = [1, 2, 3];

    [Test]
    public void BubblesortPutsArrayInAscendingOrder() {
        int[] array = {3,1,2};
        array = new Sorter().Sort(SortKind.BUBBLE, array);
        Assert.That(array, Is.EqualTo(SortedArray));
    }
	
    [Test]
    public void QuicksortPutsArrayInAscendingOrder() {
        int[] array = {3,1,2};
        array = new Sorter().Sort(SortKind.QUICK, array);
        Assert.That(array, Is.EqualTo(SortedArray));
    }
	
    [Test]
    public void InsertionsortPutsArrayInAscendingOrder() {
        int[] array = {3,1,2};
        array = new Sorter().Sort(SortKind.INSERTION, array);
        Assert.That(array, Is.EqualTo(SortedArray));
    }
}