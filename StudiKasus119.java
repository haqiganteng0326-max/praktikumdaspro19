import java.util.Scanner;

public class StudiKasus119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        int harga = 18000;
        int total;
        double diskon = 0;
        double totalBayar;
        double uangBayar;
        double kembalian;

        System.out.print("Jumlah kopi: ");
        jumlah = input.nextInt();

        total = jumlah * harga;

        if (total >= 100000) {
            diskon = total * 0.10;
        }

        totalBayar = total - diskon;

        System.out.print("Uang pembayaran: ");
        uangBayar = input.nextDouble();

        kembalian = uangBayar - totalBayar;

        System.out.println("Total pembelian : Rp" + total);
        System.out.println("Diskon          : Rp" + diskon);
        System.out.println("Total pembayaran: Rp" + totalBayar);
        System.out.println("Kembalian       : Rp" + kembalian);
    }
}