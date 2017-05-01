public class SortTest {

	/*
	 * 1. 선택정렬 // 가장 큰 원소를 찾아 이 원소와 배열의 맨 끝자리에 있는 것과 자리를 바꾼다.
	 */
	public static void selectionSort(int array[], int order) {

		int maxIndex = 0;
		int lastIndex = array.length;

		// 내림차순
		if (order == 0) {
			for (int i = 0; i < array.length; i++) {

				maxIndex = i;

				for (int j = i; j <= lastIndex; j++) {
					if (array[maxIndex] < array[j])
						maxIndex = j;
				}

				int temp = array[maxIndex];
				array[maxIndex] = array[i];
				array[i] = temp;

			}
		}
		// 오름차순
		else if (order == 1) {
			for (int i = 0; i < array.length; i++) {

				maxIndex = 0;

				for (int j = 0; j < lastIndex; j++) {
					if (array[maxIndex] < array[j])
						maxIndex = j;
				}

				int temp = array[maxIndex];
				array[maxIndex] = array[lastIndex - 1];
				array[lastIndex - 1] = temp;

				lastIndex--;

			}
		}

	}

	/*
	 * 2.버블정렬
	 */
	public static void bubbleSort(int array[], int order) {

		int temp;

		if (order == 0) {
			for (int i = array.length - 1; i >= 0; i--) {

				for (int j = 0; j < i; j++) {

					if (array[j] < array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}

				}

			}

		} else if (order == 1) {
			for (int i = array.length - 1; i >= 0; i--) {

				for (int j = 0; j < i; j++) {

					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}

				}

			}
		}

	}

	/*
	 * 3. 삽입정렬
	 */
	public static void insertionSort(int array[], int order) {

		int temp;
		int loc;

		if (order == 0) {

			for (int i = 0; i < array.length; i++) {

				loc = i;
				temp = array[i];

				// 1. 들어갈 자리를 찾는다.
				for (int j = 0; j < i; j++) {
					if (array[i] > array[j]) {
						loc = j;
						break;
					}
				}

				// 2. 한자리씩 이동
				for (int j = i; j > loc; j--) {
					array[j] = array[j - 1];
				}

				array[loc] = temp;
				
			}

		} else if (order == 1) {
			for (int i = 0; i < array.length; i++) {

				loc = i;
				temp = array[i];

				// 1. 들어갈 자리를 찾는다.
				for (int j = 0; j < i; j++) {
					if (array[i] < array[j]) {
						loc = j;
						break;
					}
				}

				// 2. 한자리씩 이동
				for (int j = i; j > loc; j--) {
					array[j] = array[j - 1];
				}

				array[loc] = temp;
				
			}
		}

	}

	public static void main(String[] args) {

		int[] randomNum = new int[10];

		for (int i = 0; i < 10; i++) {
			randomNum[i] = (int) (Math.random() * 100);
		}

		for (int n : randomNum)
			System.out.print(n + " ");
		System.out.println("");

		// selectionSort(randomNum, 0); // 0: 내림차순 , 1: 오름차순
		// selectionSort(randomNum, 1); // 0: 내림차순 , 1: 오름차순

		// bubbleSort(randomNum, 0);
		// bubbleSort(randomNum, 1);

		// insertionSort(randomNum, 0);
		// insertionSort(randomNum, 1);

		for (int n : randomNum)
			System.out.print(n + " ");

	}
}
