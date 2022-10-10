import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sort {

	void countSort(int[] arr, int size) {
		int max = arr[0], min = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		int range = max - min + 1;
		int count[] = new int[range];
		int output[] = new int[size + 1];
		for (int i = 0; i < size; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = size - 1; i >= 0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < size; i++) {
			arr[i] = output[i];
		}
	}

	void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}

public class CountingSort {
	public static void main(String[] args) {
		Sort ob = new Sort();
		out.println("enter the length of the array");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int size = 0;
		try {
			size = Integer.parseInt(in.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		int arr[] = new int[size];
		out.println("enter the elements in the array :");
		for (int i = 0; i < size; i++)
			try {
				arr[i] = Integer.parseInt(in.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		out.println("=============================================");
		out.println("array before sorting:");
		ob.printArray(arr, size);
		ob.countSort(arr, size);
		out.println("=============================================");
		out.println("array after sorting:");
		ob.printArray(arr, size);
		out.println("=============================================");

	}
}
