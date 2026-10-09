package pembelajaran_01;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class latihan10 {
    static student member = new student();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        int harga = 6300;

        System.out.println("TOKO SERBAGUNA IBIK");
        System.out.print("Masukan nama member               : ");
        String namaMember = member.getFullname(input.nextLine());
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int jumlah = input.nextInt();

        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        System.out.println(sekarang.format(format));

        int diskon = (jumlah / 3) * 5;
        int total = jumlah * harga;
        int subTotal = total - (total * diskon / 100);

        System.out.println("ITEM        QTY  HARGA        TOTAL");
        System.out.println("ROTI ENAK.  " + jumlah + "    Rp " + df.format(harga).replace(",", ".")
                + ",-   Rp " + df.format(total).replace(",", "."));
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Sub Total   : Rp " + df.format(subTotal).replace(",", ".") + ",-");
        System.out.println("Member Name : " + namaMember);

        input.close();
    }
}