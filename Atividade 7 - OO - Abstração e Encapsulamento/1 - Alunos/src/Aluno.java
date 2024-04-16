public class Aluno {
    private String nome;
    private Integer matricula;
    private Float notaProva1;
    private Float notaProva2;
    private Float notaTrabalho;

    Aluno(){
        this.nome = null;
        this.matricula = 0;
        this.notaProva1 = 0.0F;
        this.notaProva2 = 0.0F;
        this.notaTrabalho = 0.0F;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(Float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public Float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(Float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public Float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public Float notaTotal(){
        return notaProva1 + notaProva2 + notaTrabalho;
    }

    public Boolean isAprovado(){
        if (notaTotal () < 6) {
            return false;
        }
        return true;
    }
}


