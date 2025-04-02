package Ex08;

public class EquacaoSegundoGrau {
    double a, b, c, delta;
    double[] valoresX = new double[2];
    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        delta = Math.pow(b,2) - (4 * a * c);
        if (delta < 0) {
            System.out.println("A equação não possui raízes!");
        }
        return delta;
    }

    public double[] calcularX() {
        valoresX[0] = (-b + Math.sqrt(delta)) / (2 * a);
        valoresX[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return valoresX;
    }

    public void exibirRaizes(){
        System.out.println("x1 = " + valoresX[0]);
        System.out.println("x2 = " + valoresX[1]);
    }
}
