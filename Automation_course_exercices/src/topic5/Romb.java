package topic5;

public class Romb extends FiguraGeometrica{
    private double lungimeLatura;
    private double inaltime;

    public double getLungimeLatura(){
        return lungimeLatura;
    }
    public void setLungimeLatura(double lungimeLatura){
        if (lungimeLatura<=0){
            System.out.println("Lungimea laturii este introdusa gresit");
        }else {
            this.lungimeLatura=lungimeLatura;
        }
    }
    public double getInaltime(){
        return inaltime;
    }
    public void setInaltime(double inaltime){
        if (inaltime<=0){

        }else {
            this.inaltime=inaltime;
        }
    }

    @Override
    public double returneazaAria() {
        double aria = 0;
        aria=lungimeLatura*inaltime;
        System.out.println("Aria rombului este "+aria);
        return aria;
    }

    @Override
    public double returneazaPerimetrul() {
        double perimetru = 0;
        perimetru=4*lungimeLatura;
        System.out.println("Perimetrul rombului este "+perimetru);
        return perimetru;
    }
}
