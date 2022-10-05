package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.List;

public class Sokszogek {

   private List<Sokszog> lista = new ArrayList<Sokszog>();

    public Sokszogek() {
        for (int i = 0; i < 5; i++) {
            lista.add(new Teglalap((Math.random()*10 +1), (Math.random()*10+1)));
        }
    }



    public double osszKerulet()
    {
        double sum =0;
        for (int i = 0; i < lista.size(); i++) {
           sum+= lista.get(i).getKerulet();

        }
        return  sum;

    }
    public double osszTerulet()
    {
        double sum =0;
        for (int i = 0; i < lista.size(); i++) {
            sum+= lista.get(i).getTerulet();

        }
        return sum;

    }
    public double maxTerulet()
    {
        double index =0;
        double max =0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTerulet()>max)
            {
                max = lista.get(i).getTerulet();
                index =i;
            }

        }
        return index;

    }

    @Override
    public String toString() {
        return "Sokszogek{" +
                "lista=" + lista +
                '}';
    }
}
