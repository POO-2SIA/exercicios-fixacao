package Ex04;

public class Temperatura {
    double grausC, grausF, grausK;

   public double calcularGrausF() {
       this.grausF = (9.0/5.0) * this.grausC + 32;
       return this.grausF;
   }

   public double calcularGrausK() {
       this.grausK = this.grausC + 273;
       return this.grausK;
   }
}
