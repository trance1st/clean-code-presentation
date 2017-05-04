package ro.sapo.examples.sideeffects;

/**
 * Created by YG87WU on 5/3/2017.
 */
public class SideEffects {

	public static int calcPrintCube(int n) {
		System.out.println(n * n * n); //Side effect
		return n * n * n;
	}

	public static void main(String[] args) {
		calcPrintCube(10);
		int cube = calcPrintCube(20);
		System.out.println(cube);
	}
}
