package pembelajaran_01;

import java.util.Scanner;

public class latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia      : ");
        String usia = input.next();
        System.out.print("Masukkan Firstname : ");
        String firstname = input.next();
        System.out.print("Masukkan Lastname  : ");
        String lastname = input.next();
        System.out.print("Masukkan NPM       : ");
        String npm = input.next();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);
        System.out.println("Output : " + hasil);

        input.close();
    }
}