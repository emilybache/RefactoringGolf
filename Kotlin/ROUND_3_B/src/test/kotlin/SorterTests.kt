import org.junit.Test
import org.junit.Assert.assertArrayEquals


class SorterTests {
    @Test
    fun bubblesortPutsArrayInAscendingOrder() {
        var array = intArrayOf(3, 1, 2)
        array = sort(SortKind.BUBBLE, array)
        assertArrayEquals(intArrayOf(1, 2, 3), array)
    }

    @Test
    fun quicksortPutsArrayInAscendingOrder() {
        var array = intArrayOf(3, 1, 2)
        array = sort(SortKind.QUICK, array)
        assertArrayEquals(intArrayOf(1, 2, 3), array)
    }

    @Test
    fun insertionsortPutsArrayInAscendingOrder() {
        var array = intArrayOf(3, 1, 2)
        array = sort(SortKind.INSERTION, array)
        assertArrayEquals(intArrayOf(1, 2, 3), array)
    }
}