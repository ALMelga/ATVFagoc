public class Funcionario {
    String nome;
    int departamento = 0;
    double horasTrabalhadasNoMes;
    int valorDaHoradeTrabalhoDepartamento1 = 22;
    int valorDaHoradeTrabalhoDepartamento2 = 12;
    double horasAdicionais;
    double valorDaHoradeTrabalho;
    double insalubridade = 0;
    double salarioBase;
    double horasExtras;
    double bonificacao = 0;
    double salarioBruto;
    double inss;
    double impostoDeRenda;
    int planoDeSaude = 20;
    double salarioLiquido;

    void calcularSalarioBase() {

        if (departamento == 1) {
            this.valorDaHoradeTrabalho = valorDaHoradeTrabalhoDepartamento1;
        } else if (departamento == 2) {
            this.valorDaHoradeTrabalho = valorDaHoradeTrabalhoDepartamento2;
        }
        this.salarioBase = valorDaHoradeTrabalho * horasTrabalhadasNoMes;
    }

    void calcularHoraExtra () {
        if (horasTrabalhadasNoMes > 40) {
            horasAdicionais = horasTrabalhadasNoMes - 40;
        }
        this.horasExtras = horasAdicionais * 2 * valorDaHoradeTrabalho;
    }

    void calcularInsalubridade() {
        if (departamento == 2){
            this.insalubridade = (salarioBase * 0.15);}
        else if (departamento == 1){
            this.insalubridade = 0;
        }
    }

    void calcularBonificacao () {
        if(departamento == 1) {
            if (horasTrabalhadasNoMes > 20 && horasTrabalhadasNoMes < 30){
                this.bonificacao = salarioBase * 0.03;
            }
            else if (horasTrabalhadasNoMes > 30 && horasTrabalhadasNoMes < 40) {
                this.bonificacao = salarioBase * 0.05;
            }
            else if (horasTrabalhadasNoMes > 40) {
                this.bonificacao = salarioBase * 0.10;
            }
        }
    }

    void calcularSalarioBruto () {
        this.salarioBruto = salarioBase + horasExtras + insalubridade + bonificacao;
    }

    void calcularSalarioLiquido () {
        this.salarioLiquido = salarioBruto - inss - impostoDeRenda - planoDeSaude;
    }

    void calcularInss(){
        this.inss = (salarioBruto * 0.07);
    }

    void calcularImpostoDeRenda(){
        this.impostoDeRenda = (salarioBruto * 0.12);
    }
}

