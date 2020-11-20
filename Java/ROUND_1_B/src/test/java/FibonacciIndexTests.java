
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class FibonacciIndexTests {

    @ParameterizedTest
    @MethodSource("indexedFibonacciNumbers")
    public void findsIndexOfFibonacciNumber(int expectedIndex, long fibonacci) {
        assertEquals(expectedIndex, findIndexOf(fibonacci));
    }

	static Stream<Arguments> indexedFibonacciNumbers() {
		return Stream.of(
				arguments(0,0),
				arguments(1,1),
				arguments(3,2),
				arguments(4,3),
				arguments(5,5),
				arguments(6,8),
				arguments(7,13),
				arguments(8,21),
				arguments(49, 7778742049L)
			);
	}

	@Test
	public void whenNumberNotFoundThenIndexIsMinusOne() {
		assertEquals(-1, findIndexOf(7));
	}
	
	@Test
	public void cannotFindIndexOfNegativeNumber() {
		assertEquals(-1, findIndexOf(-1));
	}
	
	private int findIndexOf(long fibonacci) {
        return new FibonacciIndexer().findIndexOf(fibonacci);
	}


}
