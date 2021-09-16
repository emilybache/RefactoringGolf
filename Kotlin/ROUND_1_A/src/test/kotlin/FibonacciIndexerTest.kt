
import org.junit.Assert.assertEquals
import java.util.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


fun findIndexOf(fibonacci: Long): Int {
    if (fibonacci >= 0 && fibonacci < 2) {
        return fibonacci.toInt()
    }
    var indexOfFibonacci = -1
    var currentIndex = 2
    var f: Long = 0
    val sequence: MutableList<Long> = ArrayList(Arrays.asList(0L, 1L))
    while (f < fibonacci) {
        f = sequence[currentIndex - 1] + sequence[currentIndex - 2]
        if (f == fibonacci) indexOfFibonacci = currentIndex
        sequence.add(f)
        currentIndex++
    }
    return indexOfFibonacci
}


class FibonacciEdgeCaseTest {
    @Test
    fun whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, findIndexOf(7))
    }

    @Test
    fun cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, findIndexOf(-1))
    }
}

@RunWith(value = Parameterized::class)
class FibonacciIndexerTestParameterized(val expectedIndex: Int, val fibonacci: Long) {
    @Test
    fun findsIndexOfFibonacciNumber() {
        assertEquals(expectedIndex, findIndexOf(fibonacci))
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: isValid({0})={1}")
        fun data(): List<Array<out Any>> {
            return arrayListOf(
                    arrayOf(0, 0),
                    arrayOf(1, 1),
                    arrayOf(3, 2),
                    arrayOf(4, 3),
                    arrayOf(5, 5),
                    arrayOf(6, 8),
                    arrayOf(7, 13),
                    arrayOf(8, 21),
                    arrayOf(28, 317811)
            ).toList()
        }
    }
}