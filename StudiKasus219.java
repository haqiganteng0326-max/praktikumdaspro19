import java.util.Scanner;
public class StudiKasus219 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen;
        int peringkat;
        int pkmFunding;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenis = input.nextLine();

        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        dokumen = input.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") ||
            jenis.equalsIgnoreCase("BAKORMA") ||
            jenis.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat juara (1/2/3, 0 jika bukan juara): ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                if (dokumen == 4) {
                    System.out.println("Eligible menerima dana penghargaan.");
                } else {
                    System.out.println("Dokumen tidak lengkap.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                    System.out.println("Dokumen yang masih kurang: " + (4 - dokumen));
                }

            } else {
                System.out.println(
                    "Dana penghargaan tidak diberikan " +
                    "(hanya untuk juara 1, 2, atau 3)."
                );
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = funded, 0 = tidak funded): ");
            pkmFunding = input.nextInt();

            if (pkmFunding == 1) {

                if (dokumen == 4) {
                    System.out.println("Eligible menerima dana penghargaan (PKM funded).");
                } else {
                    System.out.println("Dokumen tidak lengkap.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                    System.out.println("Dokumen yang masih kurang: " + (4 - dokumen));
                }

            } else {
                System.out.println("Dana penghargaan tidak diberikan (PKM tidak funded).");
            }

        } else {
            System.out.println(
                "Dana penghargaan tidak diberikan " +
                "(jenis kegiatan tidak termasuk ketentuan)."
            );
        }

        input.close();
    }
    
}
