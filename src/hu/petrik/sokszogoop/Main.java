package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            Haromszog haromszog = new Haromszog();
            System.out.println(haromszog);
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }


    }


}
