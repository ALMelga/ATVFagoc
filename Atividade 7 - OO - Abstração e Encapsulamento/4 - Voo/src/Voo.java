public class Voo {
    private int numeroVoo;
    private Data data;
    private Hora horario;
    private int[] assentosOcupados;
    private int proximoLivre;

    public Voo(int numeroVoo, Data data, Hora horario, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.horario = horario;
        this.assentosOcupados = new int[capacidade];
        this.proximoLivre = 0;
    }

    public int proximoLivre() {
        while (proximoLivre < assentosOcupados.length && assentosOcupados[proximoLivre] != 0) {
            proximoLivre++;
        }
        if (proximoLivre < assentosOcupados.length) {
            return proximoLivre + 1;
        } else {
            proximoLivre = 0;
            return proximoLivre();
        }
    }




    public boolean verifica(int assento) {
        return assentosOcupados[assento - 1] == 1;
    }

    public boolean ocupa(int assento) {
        if (assento > 0 && assento <= assentosOcupados.length && !verifica(assento)) {
            assentosOcupados[assento - 1] = 1;
            return true;
        }
        return false;
    }

    public int vagas() {
        int vagas = 0;
        for (int assento : assentosOcupados) {
            if (assento == 0) {
                vagas++;
            }
        }
        return vagas;
    }

    public Hora getHorario() {
        return horario;
    }

    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(Integer numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
