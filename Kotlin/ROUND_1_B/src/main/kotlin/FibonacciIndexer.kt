import java.util.*

class FibonacciIndexer {
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
}