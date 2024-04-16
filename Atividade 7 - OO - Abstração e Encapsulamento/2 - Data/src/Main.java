import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Digite a primeira data");
        Data data1 = capturarData();
        JOptionPane.showMessageDialog(null,"Digite a segunda data:");
        Data data2 = capturarData();

        JOptionPane.showMessageDialog(null, "Data 1 formatada: " + data1.formatarData());
        JOptionPane.showMessageDialog(null, "Data 2 formatada: " + data2.formatarData());
        JOptionPane.showMessageDialog(null,"O mes da data 1 digitado por extenso é: " + data1.getMesExtenso());
        JOptionPane.showMessageDialog(null,"O mes da data 2 digitado por extenso é: " + data2.getMesExtenso());

        int resultado = data2.comparador(data1);
        if (resultado == 0) {
            JOptionPane.showMessageDialog(null, "As datas são iguais.");
        } else if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "A data 2 é maior que a data 1.");
        } else {
            JOptionPane.showMessageDialog(null, "A data 1 é maior que a data 2.");
        }
    }


    public static Data capturarData() {

        Integer dia = Integer.valueOf(JOptionPane.showInputDialog("Digite o dia: "));
        Integer mes = Integer.valueOf(JOptionPane.showInputDialog("Digite o mês: "));
        Integer ano = Integer.valueOf(JOptionPane.showInputDialog("Digite o ano: "));

        return new Data(dia, mes, ano);
    }


    }



