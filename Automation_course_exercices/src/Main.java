import Test_1.Cerc;
import Test_1.Patrat;
import Test_1.Romb;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Patrat patrat= new Patrat();
        patrat.setLungimeLatura(3);
        patrat.returneazaPerimetrul();
        patrat.returneazaAria();

        Cerc cerc = new Cerc();
        cerc.setRaza(2.5);
        cerc.returneazaPerimetrul();
        cerc.returneazaAria();

        Romb romb = new Romb();
        romb.setInaltime(3.2);
        romb.setLungimeLatura(3);
        romb.returneazaPerimetrul();
        romb.returneazaAria();
        }

    }