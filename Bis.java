public class Bis {
    private int penumpang, maxpenumpang;

    //Konstruktor
    public Bis(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
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
    }
}