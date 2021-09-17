
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

class FibonnaciEdgeCaseTest {
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