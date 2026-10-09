package pembelajaran_01;

import java.util.Scanner;

public class latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celcius : ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273;

        System.out.println("Celcius    : " + celcius);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Reamur     : " + reamur);
        System.out.println("Kelvin     : " + kelvin);

        input.close();
    }
}