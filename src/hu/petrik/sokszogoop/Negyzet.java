package hu.petrik.sokszogoop;

public class Negyzet extends Sokszog {


    public Negyzet (double a)
    {
        super(a);

    }

    @Override
    public double getKerulet() {
        return 4*getA();
    }

    @Override
    public double getTerulet() {
        return getA()*getA();
    }

    @Override
    public String toString() {

        return String.format("Négyzet: a =%-10.3f  %s ",
                this.getA(),  super.toString());

    }
}
