package Soal_No_4;

public class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}