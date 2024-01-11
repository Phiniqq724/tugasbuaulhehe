public class Bus {
    private int penumpang, maxpenumpang;
    private double berat, totalBerat;

    //Konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
        berat=0;
    }

    //Method mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp= this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        } else {
            this.penumpang =temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya adalah = " + maxpenumpang);
        System.out.println("Total beratnya adalah = " + totalBerat);
    }

    public void  getPassword(int password) {
        if(password==90){
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }

    public void addBerat(double berat){
        totalBerat = totalBerat + berat;
    }
}