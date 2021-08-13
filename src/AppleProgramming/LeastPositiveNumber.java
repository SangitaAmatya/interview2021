package AppleProgramming;

public class LeastPositiveNumber {
	public static void main(String[] args) {
		int array[] = { -8, 2, 0, 5, -3, 6, 0, 9 };

		int smallest = 0;

		for (int i = 0; i < array.length; i++) // Find the first number in array>0 (as initial
												// value for int smallest)
		{
			if (array[i] > 0) {
				smallest = array[i];
				break;
				// Break out of loop, when you find the first number >0
			}
		}

		for (int i = 0; i < array.length; i++)
		// Loop to find the smallest number in array[]
		{

			if (smallest > array[i] && array[i] > 0) {
				smallest = array[i];

			}

		}

		System.out.println(smallest);

	}

}
