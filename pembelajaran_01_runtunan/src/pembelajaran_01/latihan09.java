package pembelajaran_01;

import java.util.Scanner;

public class latihan09 {
    static student myBio = new student();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM          : ");
        Integer npm = myBio.getNPM(input.nextInt());
        input.nextLine();

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = myBio.getFullname(input.nextLine());

        System.out.print("Masukkan Nama Kelas   : ");
        String kelas = myBio.getClassName(input.nextLine());

        System.out.print("Masukkan Semester     : ");
        Integer semester = myBio.getSemester(input.nextInt());

        System.out.print("Masukkan IPK          : ");
        Float ipk = myBio.getGPA(input.nextFloat());

        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nama Kelas   : " + kelas);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + ipk);

        input.close();
    }
}
