import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            Funcionario funcionario = new Funcionario();
            funcionario.nome = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i+1) + ": ");
            funcionario.departamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o departamento do funcionário "+ (i+1) + " (1 = Administrativo / 2 = Produção) :"));
            funcionario.horasTrabalhadasNoMes = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas no mês do funcionário "+ (i+1) + ": "));

            funcionario.calcularSalarioBase();
            funcionario.calcularHoraExtra();
            funcionario.calcularInsalubridade();
            funcionario.calcularBonificacao();
            funcionario.calcularSalarioBruto();
            funcionario.calcularInss();
            funcionario.calcularImpostoDeRenda();
            funcionario.calcularSalarioLiquido();

            funcionarios[i] = funcionario;

        }

        System.out.println("Tabela de funcionários:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Funcionário " + (i+1) + ": " + "\n");
            System.out.println("Nome: " + funcionarios[i].nome);
            System.out.println("Salário Base: " + String.format("%.2f", funcionarios[i].salarioBase));
            System.out.println("Horas Extras: " + String.format("%.2f", funcionarios[i].horasExtras));
            System.out.println("Insalubridade: " + String.format("%.2f", funcionarios[i].insalubridade));
            System.out.println("Bonificação: " + String.format("%.2f", funcionarios[i].bonificacao));
            System.out.println("Inss: " + String.format("%.2f", funcionarios[i].inss));
            System.out.println("Imposto de Renda: " + String.format("%.2f", funcionarios[i].impostoDeRenda));
            System.out.println("Plano de Saúde: " + funcionarios[i].planoDeSaude);
            System.out.println("Salário Líquido: " + String.format("%.2f", funcionarios[i].salarioLiquido));
            System.out.println("\n");
        }
    }
    }

