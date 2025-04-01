package Ex03;

public class Retangulo {
    public double base, altura;

    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
