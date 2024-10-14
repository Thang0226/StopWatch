public class Main {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();

		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}

		// Selection sort
		stopWatch.start();
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int key = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					key = j;
				}
			}
			if (key > i) {
				int temp = array[i];
				array[i] = array[key];
				array[key] = temp;
			}
		}
		stopWatch.stop();

		System.out.println("Execution time of selection sort 100000 integers: "
				+ stopWatch.getElapsedTime() + " milliseconds");
	}
}