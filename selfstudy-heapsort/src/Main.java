
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 11, 13, 14, 6, 20, 25, 98, 64, 87, 3, -5 };
		int size = arr.length;

		HeapSort hp = new HeapSort();
		hp.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print("; " + arr[i]);
			} else {
				System.out.print(arr[i]);
			}
		}
	}
}
