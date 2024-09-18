package Test_1;

public class Cerc  extends FiguraGeometrica{
    private double raza;

    public void setRaza( double raza ){
        if (raza<=0){
            System.out.println("Raza este introdusa incorect");

        }else {
            this.raza=raza;
        }
    }

    @Override
    public double returneazaAria() {
        double aria;
        aria=Math.PI*(raza*raza);
        System.out.println("Aria cercului este " + aria);
        return aria;

    }

    @Override
    public double returneazaPerimetrul() {
        double perimetrul;
        perimetrul=2*Math.PI*raza;
        System.out.println("Perimetrul cercului este " + perimetrul);
        return perimetrul;
    }
}
