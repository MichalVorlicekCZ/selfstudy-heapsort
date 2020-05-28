
public class HeapSort {

	public void changeHead(int[] arr, int size, int i) {
		int biggest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < size && arr[left] > arr[biggest]) {
			biggest = left;
		}
		
		if (right < size && arr[right] > arr[biggest]) {
			biggest = right;
		}

		if (biggest != i) {
			int temp = arr[i];
			arr[i] = arr[biggest];
			arr[biggest] = temp;

			changeHead(arr, size, i);
		}
	}

	public void sort(int[] arr) {
		int size = arr.length;

		for (int i = size / 2 - 1; i >= 0; i--) {
			changeHead(arr, size, i);
		}

		for (int i = size - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			changeHead(arr, i, 0);
		}
	}
}
