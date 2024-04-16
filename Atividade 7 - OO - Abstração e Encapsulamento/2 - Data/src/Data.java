public class Data {
    private Integer dia;
    private Integer mes ;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
    }
        else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        if (dataValida(dia, mes, ano)) {
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (dataValida(dia, mes, ano)) {
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean dataValida(Integer dia, Integer mes, Integer ano) {
        if (ano == null || mes == null || dia == null || ano < 1 || mes < 1 || mes > 12 || dia < 1){
            return false;
    }
        int maximoDias = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            maximoDias = 30;
        }
        else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
                maximoDias = 29;
            }
            else maximoDias = 28;
        }

        return dia <= maximoDias;
    }


public int comparador(Data outraData) {
    if (this.ano.equals(outraData.ano)) {
        if (this.mes.equals(outraData.mes)) {
            return Integer.compare(this.dia, outraData.dia);
        } else {
            return Integer.compare(this.mes, outraData.mes);
        }
    } else {
        return Integer.compare(this.ano, outraData.ano);
    }
}


public String formatarData() {
    return String.format("%02d/%02d/%04d", dia, mes, ano);
}


public String getMesExtenso() {
    String mesExtenso;
    switch (mes) {
        case 1:
            mesExtenso = "Janeiro";
            break;
        case 2:
            mesExtenso = "Fevereiro";
            break;
        case 3:
            mesExtenso = "Março";
            break;
        case 4:
            mesExtenso = "Abril";
            break;
        case 5:
            mesExtenso = "Maio";
            break;
        case 6:
            mesExtenso = "Junho";
            break;
        case 7:
            mesExtenso = "Julho";
            break;
        case 8:
            mesExtenso = "Agosto";
            break;
        case 9:
            mesExtenso = "Setembro";
            break;
        case 10:
            mesExtenso = "Outubro";
            break;
        case 11:
            mesExtenso = "Novembro";
            break;
        case 12:
            mesExtenso = "Dezembro";
            break;
        default:
            mesExtenso = "Mês inválido";
    }
    return mesExtenso;
}
}
