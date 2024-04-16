public class NumeroInteiro {
    private Integer numero;
    private Integer soma;
    private Integer subtracao;

    public Integer getNumero() {
        return numero;
    }

    public Integer getSoma() {
        return soma;
    }

    public Integer getSubtracao() {
        return subtracao;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public NumeroInteiro(){
        this.numero = 0;
    }

    public NumeroInteiro (Integer numero){
        this.numero = numero;
    }

    public void soma(NumeroInteiro SegundoNumero) {
        this.soma = this.numero + SegundoNumero.getNumero();
    }

    public void subtrai(NumeroInteiro SegundoNumero) {
        this.subtracao = this.numero - SegundoNumero.getNumero();
    }

    public boolean ePrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getNextPrimo() {
        numero = numero + 1;
        while (true) {
            if (ePrimo()) {
                return numero;
            }
            numero++;
        }
    }



}
