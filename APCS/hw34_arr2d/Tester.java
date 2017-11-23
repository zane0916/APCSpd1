public class Tester {
    public static void populate(int[][] array) {
	int entry = 0;
	for (int ctr1 = 0; ctr1 < array.length; ctr1 ++) {
	    for (int ctr2 = 0; ctr2 < array[ctr1].length; ctr2 ++) {
		array[ctr1][ctr2] = entry;
		entry += 1;
	    }
	}
    }
    public static void printAll(int[][] array) {
	for (int ctr1 = 0; ctr1 < array.length; ctr1 ++) {
	    for (int ctr2 = 0; ctr2 < array[ctr1].length; ctr2 ++) {
		System.out.println(array[ctr1][ctr2]);
	    }
	}
    }
    public static void main(String[] args) {
	int[][] a2 = new int[2][3];
	populate(a2);
	printAll(a2);
    }
}
