package calculadora;

public class Calculadora {

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int res = suma(a, b);
		System.out.println("la suma es: " + res);

	}

}
