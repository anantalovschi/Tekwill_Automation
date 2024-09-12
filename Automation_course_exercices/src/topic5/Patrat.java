package topic5;

public class Patrat extends FiguraGeometrica{
    private double lungimeLatura;

    public void setLungimeLatura(double lungimeLatura){
        if(lungimeLatura<=0){
            System.out.println("Lungimea laturii patratului este introdusa gresit");
        }else {
            this.lungimeLatura=lungimeLatura;
        }
    }

    @Override
    public  double returneazaAria() {
        double aria;
        aria=lungimeLatura*lungimeLatura;
        System.out.println("Aria patratului este "+aria);
        return aria;
    }

    @Override
    public  double returneazaPerimetrul() {
        double perimetrul;
        perimetrul=4*lungimeLatura;
        System.out.println("Perimetrul patratului este "+perimetrul);
        return perimetrul;
    }
}
