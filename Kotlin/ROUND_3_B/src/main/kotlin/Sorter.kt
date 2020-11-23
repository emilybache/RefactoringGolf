enum class SortKind {
    BUBBLE, QUICK, INSERTION
}

fun sort(kind: SortKind, input: IntArray): IntArray {
    return when (kind) {
        SortKind.BUBBLE -> Bubble().sort(input)
        SortKind.QUICK -> Quick().sort(input)
        SortKind.INSERTION -> Insertion().sort(input)
    }
}

abstract class Sorter {
    abstract fun sort(input: IntArray): IntArray

    protected fun swap(input: IntArray, index1: Int, index2: Int) {
        val first = input[index1]
        val second = input[index2]
        input[index1] = second
        input[index2] = first
    }
}

class Bubble : Sorter() {
    override fun sort(input: IntArray): IntArray {
        var sorted = false
        while (!sorted) {
            sorted = true
            var i = 0
            while (i < input.size - 1) {
                if (input[i] > input[i + 1]) {
                    super.swap(input, i, i + 1)
                    sorted = false
                }
                i++
            }
        }
        return input
    }

}

class Quick : Sorter() {
    override fun sort(input: IntArray): IntArray {
        return quicksort(input, 0, input.size - 1)
    }

    private fun quicksort(input: IntArray, left: Int, right: Int): IntArray {
        var i = left
        var j = right
        val pivot = input[(left + right) / 2]
        var k = i
        while (k <= j) {
            while (input[k] < pivot) k++
            while (input[j] > pivot) j--
            if (k <= j) {
                swap(input, k, j)
                k++
                j--
            }
        }
        i = k
        val index = i
        if (left < index - 1) {
            quicksort(input, left, index - 1)
        }
        if (index < right) {
            quicksort(input, index, right)
        }
        return input
    }
}

class Insertion : Sorter() {
    override fun sort(input: IntArray): IntArray {
        var i = 0
        while (i < input.size - 1) {
            var j = i + 1
            while (j > 0) {
                if (input[j] < input[j - 1]) {
                    super.swap(input, j, j - 1)
                }
                j--
            }
            i++
        }
        return input
    }

}