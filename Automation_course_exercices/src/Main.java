import topic5.Cerc;
import topic5.Patrat;
import topic5.Romb;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("");
        System.out.println("");
        Patrat patrat= new Patrat();
        patrat.setLungimeLatura(3);
        patrat.returneazaPerimetrul();
        patrat.returneazaAria();
        System.out.println("");

        Cerc cerc = new Cerc();
        cerc.setRaza(2.5);
        cerc.returneazaPerimetrul();
        cerc.returneazaAria();
        System.out.println("");

        Romb romb = new Romb();
        romb.setInaltime(3.2);
        romb.setLungimeLatura(3);
        romb.returneazaPerimetrul();
        romb.returneazaAria();
        }

    }