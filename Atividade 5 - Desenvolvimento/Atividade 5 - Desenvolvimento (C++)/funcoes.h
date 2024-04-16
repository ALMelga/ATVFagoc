#ifndef FUNCOES_H_INCLUDED
#define FUNCOES_H_INCLUDED

//variaveis e funcoes utilizadas para o calculo

int valorDaHoradeTrabalhoDepartamento1 = 22;
int valorDaHoradeTrabalhoDepartamento2 = 12;
int horasAdicionais;
double valorHoradeTrabalho;
double insalubridade = 0;
double salarioBase;
double horasExtras;
double bonificacao = 0;
double salarioBruto;
double inss = (salarioBruto * 0.07);
double impostoDeRenda = (salarioBruto * 0.12);
int planoDeSaude = 20;
double salarioLiquido;

double calcularSalarioBase(double horasTrabalhadasNoMes, int departamento) {

    if (departamento == 1) {
        valorHoradeTrabalho = valorDaHoradeTrabalhoDepartamento1;
    } else if (departamento == 2) {
        valorHoradeTrabalho = valorDaHoradeTrabalhoDepartamento2;
    }
    salarioBase = valorHoradeTrabalho * horasTrabalhadasNoMes;
    return salarioBase;
}

double calcularHoraExtra (double valorDaHoradeTrabalho,double horasTrabalhadasNoMes,int horasAdicionais) {
    if (horasTrabalhadasNoMes > 40) {
        horasAdicionais = horasTrabalhadasNoMes - 40;
    }
    horasExtras = horasAdicionais * 2 * valorDaHoradeTrabalho;
    return horasExtras;
}

double calcularInsalubridade(int departamento,double salarioBase) {
    if (departamento == 2){
    insalubridade = (salarioBase * 0.15);}
    else if (departamento == 1){
        insalubridade = 0;
    }
    return insalubridade;
}

double calcularBonificacao (int departamento,double horasTrabalhadasnoMes) {
    if(departamento == 1) {
    if (horasTrabalhadasnoMes > 20 && horasTrabalhadasnoMes < 30){
        bonificacao = salarioBase * 0.03;
    }
    else if (horasTrabalhadasnoMes > 30 && horasTrabalhadasnoMes < 40) {
        bonificacao = salarioBase * 0.05;
    }
    else if (horasTrabalhadasnoMes > 40) {
        bonificacao = salarioBase * 0.10;
    }
    else if(departamento == 2){
        bonificacao = 0;
    }
    return bonificacao;
    }
}

double calcularSalarioBruto (double salarioBase,double horasExtras,double insalubridade,double bonificacao) {
    salarioBruto = salarioBase + horasExtras + insalubridade + bonificacao;
    return salarioBruto;
}

double calcularSalarioLiquido (double salarioBruto,double inss,double impostoDeRenda,int planoDeSaude) {
    salarioLiquido = salarioBruto - inss - impostoDeRenda - planoDeSaude;
    return salarioLiquido;
}


#endif // FUNCOES_H_INCLUDED
