
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class FibonacciIndexTests {

	public static Stream<Arguments> data() {
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

	@ParameterizedTest
	@MethodSource("data")
	public void findsIndexOfFibonacciNumber(int expectedIndex, long fibonacci) {
		assertEquals(expectedIndex, findIndexOf(fibonacci));
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
		if(fibonacci >= 0 && fibonacci < 2){
			return (int)fibonacci;
		}
		int indexOfFibonacci = -1;
		int currentIndex = 2;
		long f = 0;
		List<Long> sequence = new ArrayList<Long>(Arrays.asList(0L, 1L));
		while(f < fibonacci){
			f = sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
			if(f == fibonacci)
				indexOfFibonacci = currentIndex;
			sequence.add(f);
			currentIndex++;
		}
	
		return indexOfFibonacci;
	}


}
