package dasar;

public class Break {

	public static void main(String[] args) {
		
		var angka = 1;
		while (true) {
			System.out.println("Angka : " + angka);
			angka++;
			
			if (angka > 15) {
				break;
			}
		}

	}

}
