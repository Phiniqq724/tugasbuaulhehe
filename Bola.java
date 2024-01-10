public class Bola {
    private double r, d, lp,v;
    public double  pi = Math.PI;

    public Bola(double r){
        this.r = r;
    }

    public void setJarijari(double newJari){
        this.r = newJari;
    }
    public void showDiameter(){
        this.d = r * 2;
        System.out.println(d);
    }
    public void showLuasPerm(){
        this.lp = 4 * pi * r * r;
        System.out.println(lp);
    }
    public void showVolume(){
        this.v = (4/3) * pi * r * r;
        System.out.println(v);
    }


}
