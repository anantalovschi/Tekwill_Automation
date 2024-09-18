package Test_1;

public class Romb extends FiguraGeometrica{
    private double lungimeLatura;
    private double inaltime;

    public void setLungimeLatura(double lungimeLatura){
        if (lungimeLatura<=0){
            System.out.println("Lungimea laturii este introdusa gresit");
        }else {
            this.lungimeLatura=lungimeLatura;
        }
    }

    public void setInaltime(double inaltime){
        if (inaltime<=0){
            System.out.println("Inaltimea este introdusa incorect");
        }else {
            this.inaltime=inaltime;
        }
    }

    @Override
    public double returneazaAria() {
        double aria;
        aria=lungimeLatura*inaltime;
        System.out.println("Aria rombului este "+aria);
        return aria;
    }

    @Override
    public double returneazaPerimetrul() {
        double perimetru;
        perimetru=4*lungimeLatura;
        System.out.println("Perimetrul rombului este "+perimetru);
        return perimetru;
    }
}
