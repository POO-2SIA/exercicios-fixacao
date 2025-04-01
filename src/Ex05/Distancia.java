package Ex05;

public class Distancia {
    private final double MILHAS = 0.000621371;
    private final double PES = 3.28084;


    public double calcularMilhas(double metros){
        return metros * MILHAS;
    }

    public double calcularPes(double metros) {
        return metros * PES;
    }
}
