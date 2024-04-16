import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            Voo voo = capturarInformacoesVoo();
            exibirInformacoesVoo(voo);
            menuAssentos(voo);
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja criar outro voo?", "Novo Voo", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    public static Voo capturarInformacoesVoo() {
        JOptionPane.showMessageDialog(null,"CRIAÇÃO DE VOO");
        int numeroVoo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do voo:"));
        Data data = capturarData();
        Hora horario = capturarHorario();
        int capacidade = 100;
        return new Voo(numeroVoo, data, horario, capacidade);
    }

    public static Data capturarData() {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do voo:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do voo:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do voo:"));
        return new Data(dia, mes, ano);
    }

    public static Hora capturarHorario() {
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do voo:"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos do voo:"));
        return new Hora(hora, minutos);
    }

    public static void exibirInformacoesVoo(Voo voo) {
        JOptionPane.showMessageDialog(null,
                "Voo criado com sucesso:\n\n" +
                        "Número do Voo: " + voo.getNumeroVoo() + "\n" +
                        "Data do Voo: " + voo.getData().formatarData() + "\n" +
                        "Horário do Voo: " + voo.getHorario().displayHora() + "\n\n" +
                        "Vagas disponíveis: " + voo.vagas());
    }

    public static void menuAssentos(Voo voo) {
        boolean continuar = true;
        while (continuar) {
            String[] options = {"Ocupar Assento", "Verificar Assento", "Próximo Assento Livre", "Número de Assentos Disponíveis", "Sair"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Escolha uma opção:",
                    "Menu de Assentos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    ocuparAssento(voo);
                    break;
                case 1:
                    verificarAssento(voo);
                    break;
                case 2:
                    int proximoAssento = voo.proximoLivre();
                    if (proximoAssento != -1) {
                        JOptionPane.showMessageDialog(null, "Próximo assento livre: " + proximoAssento);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há assentos livres disponíveis.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Número de assentos disponíveis: " + voo.vagas());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite novamente.");
                    break;
            }
        }
    }




    public static void ocuparAssento(Voo voo) {
        int assento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento a ser ocupado:"));
        boolean sucesso = voo.ocupa(assento);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Assento " + assento + " ocupado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao ocupar o assento " + assento + ". Assento já está ocupado ou número inválido.");
        }
    }

    public static void verificarAssento(Voo voo) {
        int assento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento a ser verificado:"));
        boolean ocupado = voo.verifica(assento);
        if (ocupado) {
            JOptionPane.showMessageDialog(null, "Assento " + assento + " está ocupado.");
        } else {
            JOptionPane.showMessageDialog(null, "Assento " + assento + " está livre.");
        }
    }
}




