public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus(5);

        // busMini.penumpang = 5;
        // busMini.maxpenumpang = 5;
        // busMini.cetak();
        // busMini.penumpang = busMini.penumpang + 5;
        // busMini.cetak();
        // busMini.penumpang = busMini.penumpang - 2;
        // busMini.cetak();
        // busMini.penumpang = busMini.penumpang + 8;
        // busMini.cetak();
        // Ini untuk latihan pertama

        // busMini.addpenumpang(5);
        // busMini.cetak();
        // busMini.addpenumpang(-2);
        // busMini.cetak();
        // busMini.addpenumpang(10);
        // busMini.cetak();
        // Ini untuk latihan 2.1

        busMini.getPassword(235);
        busMini.getPassword(90);
        // busMini.getAverage();
        // busMini.cetak();
        // busMini.addpenumpang(3);
        // busMini.addBerat(90);
        // busMini.getAverage();
        // busMini.cetak();
        // busMini.addpenumpang(1);
        // busMini.addBerat(50);
        // busMini.getAverage();
        // busMini.cetak();
        // busMini.addpenumpang(1);
        // busMini.addBerat(40);
        // busMini.getAverage();
        // busMini.cetak();
        busMini.addpenumpang(4);
        busMini.addBerat(30);
        busMini.addBerat(40);
        busMini.addBerat(30);
        busMini.addBerat(20);
        busMini.getAverage();
        busMini.cetak();
    }
}
