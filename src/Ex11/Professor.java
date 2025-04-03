package Ex11;

public class Professor {
    private String nome;
    private String titulo;
    private int numAulasSemanais;
    private double valorHoraAula;
    private double salario;

    public Professor(String nome, String titulo, int numAulasSemanais, double valorHoraAula) {
        this.nome = nome;
        this.titulo = titulo;
        this.numAulasSemanais = numAulasSemanais;
        this.valorHoraAula = valorHoraAula;
    }

    private void calcularSalarioBase(){
        double salarioBase = numAulasSemanais * 4.5 * valorHoraAula;
        double aumento;

        if (titulo.equalsIgnoreCase("Mestre")) {
            aumento = 0.085;
        } else if (titulo.equalsIgnoreCase("Doutor")) {
            aumento = 0.12;
        } else {
            aumento = 0;
        }

        salarioBase = salarioBase + (salarioBase * aumento);

        salario = salarioBase;
    }

    private void calcularHoraAtividade() {
        salario = salario + (salario * 0.05);
    }

    private void calcularDescansoSemanal() {
        salario = salario + (salario / 6);
    }

    public void CalcularSalario() {
        calcularSalarioBase();
        calcularHoraAtividade();
        calcularDescansoSemanal();
        System.out.println("Informações: ");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Título: " + this.titulo);
        System.out.println("Salário: " + String.format("%.2f", this.salario));
    }

}
