package dasar;

public class Array {

	public static void main(String[] args) {
		
		String[] nama;
		nama = new String[3];
		nama[0] = "Afif";
		nama[1] = "Faizun";
		nama[2] = "Alex";
		
		
		for( int i = 0; i < 3; i++) {
			System.out.println("Index ke " + i + ": " + nama[i]);
		}
		
		System.out.println("Array 3D");
		
		String[][] buah = {
			{"Mangga", "Apel", "Leci"},
			{"Anggur", "Sirsak", "Jambu"},
			{"Semangka", "Melon", "Jeruk"}
		};
		
		System.out.println(buah[1][0]);
		
		

	}

}
