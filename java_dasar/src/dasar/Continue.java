package dasar;

public class Continue {

	public static void main(String[] args) {
		
		for ( int angka = 1; angka <= 20; angka++) {
			if (angka % 2 == 0) {
				continue;
			}
			
			System.out.println("Angka Ganjil : " + angka);
		}

	}

}
