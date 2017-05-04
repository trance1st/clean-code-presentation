package ro.sapo.examples.dry;

/**
 * Created by YG87WU on 5/3/2017.
 */
public class DRY {

	public static void main(String[] args) {
		calculateAverageNoDuplication();
	}

	public static void calculateAverage() {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int b[] = new int[3];
		b[0] = 5;
		b[1] = 10;
		b[2] = 15;

		int sumA = 0;
		for(int i=0; i< a.length; i++) {
			sumA += a[i];
		}
		int averageA = sumA/a.length;

		int sumB = 0;
		for(int i=0; i< b.length; i++) {
			sumB += b[i];
		}
		int averageB = sumB/a.length;

		System.out.println(averageA);
		System.out.println(averageB);

	}

	public static void calculateAverageNoDuplication() {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int b[] = new int[3];
		b[0] = 5;
		b[1] = 10;
		b[2] = 15;

		System.out.println(average(a));
		System.out.println(average(b));
	}

	public static int average(int a[]) {
		int sumA = 0;
		for(int i=0; i< a.length; i++) {
			sumA += a[i];
		}
		return sumA/a.length;
	}
}
