import javax.swing.*;

public class Main {
    public static void main (String[] args){
        JOptionPane.showMessageDialog(null,"Digite o primeiro Horário");
        Hora hora1 = capturarHora();
        JOptionPane.showMessageDialog(null,"Digite o segundo Horário");
        Hora hora2 = capturarHora();

        JOptionPane.showMessageDialog(null,"Horario 1 completo: " + hora1.displayHora());
        JOptionPane.showMessageDialog(null,"Horario 2 completo: " + hora2.displayHora());

        int diferenca = hora1.comparador(hora2);
        if (diferenca == 0) {
            JOptionPane.showMessageDialog(null,"As horas são iguais.");
        } else {
            JOptionPane.showMessageDialog(null,"A diferença em segundos do horário 1 para o horário 2 é: " + diferenca);
        }

    }
    public static Hora capturarHora() {

        Integer segundos = Integer.valueOf(JOptionPane.showInputDialog("Digite os segundos (59): "));
        Integer minutos = Integer.valueOf(JOptionPane.showInputDialog("Digite os minutos (59): "));
        Integer horas = Integer.valueOf(JOptionPane.showInputDialog("Digite as horas (23): "));

        return new Hora(segundos,minutos,horas);
    }

}
