public class Exercicio01 {
	public static void main(String[] args) {
		int aux = 0;
		for (int x = 0; x <= 100; x++) {
			if ((x % 2 != 0 ) && (x > 10 && x < 50)) {
				aux++;
			}
		}
		System.out.println(aux);	
	}	
}