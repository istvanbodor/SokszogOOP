package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog{

    private double alfa;

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa, double a, double b) {
        this.alfa = alfa;
    }

    public Paralelogramma(double a) {
        super(a);
    }

    @Override
    public double getKerulet() {
        return 0;
    }

    @Override
    public double getTerulet() {
        return 0;
    }
}
