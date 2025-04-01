package Ex06;

import java.text.DecimalFormat;

public class Hora {
    int hora, minutos, segundos;
    public Hora(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        if (hora < 0 || hora > 23) {
            this.hora = 0;
        }
        if (minutos < 0 || minutos > 59) {
            this.minutos = 0;
        }
        if (segundos < 0 || segundos > 59) {
            this.segundos = 0;
        }
    }

    public void exibirHorario() {
        DecimalFormat dc = new DecimalFormat("00");
        System.out.println(dc.format(this.hora) + ":" + dc.format(this.minutos) + ":" + dc.format(this.segundos));
    }
}
