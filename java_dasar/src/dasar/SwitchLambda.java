package dasar;


public class SwitchLambda {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Luar Biasa");
            case "B", "C" -> System.out.println("Kerja Bagus");
            default -> {
                System.out.println("Belajar lebih Giat");
            }
        }

    }
}