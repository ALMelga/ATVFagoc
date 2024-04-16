import javax.swing.*;

public class Main {
    public static void main(String[] agrs){
        JOptionPane.showMessageDialog(null,"Digite o primeiro Número");
        NumeroInteiro numero1 = capturarValores();
        JOptionPane.showMessageDialog(null,"Digite o segundo Número");
        NumeroInteiro numero2 = capturarValores();

        numero1.soma(numero2);
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + numero1.getSoma());

        numero1.subtrai(numero2);
        JOptionPane.showMessageDialog(null, "Resultado da subtração: " + numero1.getSubtracao());

        if (numero1.ePrimo()){
            JOptionPane.showMessageDialog(null,"O número " + numero1.getNumero() + " é primo.");
            JOptionPane.showMessageDialog(null,"O proximo número primo é: " + numero1.getNextPrimo());
        }
    }


    public static NumeroInteiro capturarValores(){

        Integer numero = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor: "));

        return new NumeroInteiro(numero);
    }
}

