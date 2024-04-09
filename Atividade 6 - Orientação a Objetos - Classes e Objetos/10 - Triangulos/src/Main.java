import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo();
        triangulo.lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado 1:"));
        triangulo.lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado 2:"));
        triangulo.lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado 3:"));
        triangulo.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura:"));

        triangulo.calcularBase();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        String mensagem = "Área do triângulo: " + triangulo.area + "\n";
            mensagem += "Perímetro do triângulo: " + triangulo.perimetro + "\n";
        JOptionPane.showMessageDialog(null,mensagem);

        triangulo.IsEquilatero();
        triangulo.IsEscaleno();
        triangulo.IsIsosceles();
}
}