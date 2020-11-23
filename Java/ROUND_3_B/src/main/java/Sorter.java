

public abstract class Sorter {

	public static int[] sort(SortKind kind, int[] input) {
		switch (kind) {
			case BUBBLE:
				return new Bubble().doSort(input);
			case QUICK:
				return new Quick().doSort(input);
			case INSERTION:
				return new Insertion().doSort(input);

		}
		throw new RuntimeException("unknown sort kind " + kind);
	}

	protected abstract int[] doSort(int[] input);

	protected void swap(int[] input, int index1, int index2) {
		int first = input[index1];
		int second = input[index2];
		input[index1] = second;
		input[index2] = first;
	}


}
