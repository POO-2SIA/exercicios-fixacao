package Ex10;

public class Triangulo {
    private int a, b, c;

    public Triangulo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean validarTriangulo() {
        return (a < b + c && b < a + c && c < b + a);
    }

    public double calcularArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calcularPerimetro() {
        return a + b + c;
    }

    public double calcularCentroideX() {
        double cx, lambda;
        lambda = calcularLambda();
        cx = (b + a * lambda) / 3;
        return cx;
    }

    public double calcularCentroideY() {
        double cy, lambda;
        lambda = calcularLambda();
        cy = a / 3 * Math.sqrt(1 - lambda * lambda);
        return cy;
    }

    public double calcularLambda() {
        double lambda = lambda = (a * a + b * b - c * c) / (2 * a * b);
        return lambda;
    }

}
