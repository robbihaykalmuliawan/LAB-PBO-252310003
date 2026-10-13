package Pembelajaran_02;

public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();
        String ulang;

        do {
            resto.chooseMenu();
            System.out.print("Apakah anda akan memesan kembali ? (y/n): ");
            ulang = Resto.scanner.nextLine().trim();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terimakasih telah memesan.");
        Resto.scanner.close();
    }
}
