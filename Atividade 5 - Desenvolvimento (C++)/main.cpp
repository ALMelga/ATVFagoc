#include <iostream>
#include <iomanip>
#include <string>
#include "funcoes.h"

using namespace std;

struct funcionarios{
    string nome;
    int departamento;
    double horasTrabalhadasNoMes;
    };

int main() { // pega os dados dos funcionarios e os imprime

    const int maximofuncionarios=5;
    struct funcionarios funcionario[maximofuncionarios];

    cout << "Digite as informacoes de 5 funcionarios: ""\n" << endl;

        for (int i=0;i < maximofuncionarios;i++) {
        cout << "Digite o nome do funcionario " << i+1 << ": ";
        getline(cin,funcionario[i].nome);

        cout << "Digite o departamento do funcionario " << i+1 << " (1 = Administrativo / 2 = Producao): ";
        cin >> funcionario[i].departamento;
        if (funcionario[i].departamento != 1 && funcionario[i].departamento != 2) {
                cout << "Erro! Departamento invalido!";
            return 0;
        }
        cout << "Digite as horas trabalhadas no mes do funcionario " << i+1 << ": ";
        cin >> funcionario[i].horasTrabalhadasNoMes;
        cin.ignore();
        cout << endl;

    }
    cout << "\n";


    cout << "\n";
    cout << "TABELA DE FUNCIONARIOS: " << endl;
    cout << "\n";

    cout << setw(20) << left << "Ordem";
    cout << setw(20) << left << "Nome";
    cout << setw(18) << left << "Salario Base";
    cout << setw(15) << left << "Hora Extra";
    cout << setw(18) << left << "Insalubridade";
    cout << setw(15) << left << "Bonificacao";
    cout << setw(10) << left << "INSS";
    cout << setw(15) << left << "Imp. Renda";
    cout << setw(10) << left << "P.Saude";
    cout << setw(18) << left << "Salario Liquido" << endl;

    for(int i = 0; i < maximofuncionarios ;i++) {
        double salarioBase = calcularSalarioBase(funcionario[i].horasTrabalhadasNoMes, funcionario[i].departamento);
        double horasExtras = calcularHoraExtra(valorHoradeTrabalho, funcionario[i].horasTrabalhadasNoMes, horasAdicionais);
        double insalubridade = calcularInsalubridade(funcionario[i].departamento, salarioBase);
        double bonificacao = calcularBonificacao(funcionario[i].departamento, funcionario[i].horasTrabalhadasNoMes);
        double salarioBruto = calcularSalarioBruto(salarioBase, horasExtras, insalubridade, bonificacao);
        double inss = salarioBruto * 0.07;
        double impostoDeRenda = salarioBruto * 0.12;
        int planoDeSaude = 20;
        double salarioLiquido = calcularSalarioLiquido(salarioBruto, inss, impostoDeRenda, planoDeSaude);

        cout << "\n";
        cout << setw(20) << left << "Funcionario(a)";
        cout << setw(20) << left << funcionario[i].nome;
        cout << setw(18) << left << fixed << setprecision(2) << salarioBase;
        cout << setw(15) << left << fixed << setprecision(2) << horasExtras;
        cout << setw(18) << left << fixed << setprecision(2) << insalubridade;
        cout << setw(15) << left << fixed << setprecision(2) << bonificacao;
        cout << setw(10) << left << fixed << setprecision(2) << inss;
        cout << setw(15) << left << fixed << setprecision(2) << impostoDeRenda;
        cout << setw(10) << left << planoDeSaude;
        cout << setw(18) << left << fixed << setprecision(2) << salarioLiquido << endl;
    }

    return 0;
}
