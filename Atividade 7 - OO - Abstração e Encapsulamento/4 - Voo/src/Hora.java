public class Hora {
    private Integer segundos;
    private Integer minutos;
    private Integer horas;

    public Hora(Integer horas, Integer minutos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60) {
            this.segundos = 0;
            this.minutos = minutos;
            this.horas = horas;
        } else {
            this.segundos = 0;
            this.minutos = 0;
            this.horas = 0;
        }
    }

    public Integer comparador(Hora Hora2) {
        if (this.horas.equals(Hora2.horas) && this.minutos.equals(Hora2.minutos) && this.segundos.equals(Hora2.segundos)) {
            return 0;
        } else {
            int segundosAtuais = this.horas * 3600 + this.minutos * 60 + this.segundos;
            int segundosHora2 = Hora2.horas * 3600 + Hora2.minutos * 60 + Hora2.segundos;
            return segundosAtuais - segundosHora2;
        }
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String displayHora() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}

