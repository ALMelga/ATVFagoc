import javax.swing.*;

public class Triangulo {
    float lado1;
    float lado2;
    float lado3;
    float altura;
    float base;
    float area;
    float perimetro;


void IsEquilatero(){
    if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
        JOptionPane.showMessageDialog(null,"O triângulo é equilátero:  " + lado1 + "  " + lado2 + "  " + lado3);
    }
}

void IsEscaleno(){
    if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        JOptionPane.showMessageDialog(null,"O triângulo é escaleno:  " + lado1 + "  " + lado2 + "  " + lado3);
    }
}

void IsIsosceles(){
    if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado3 != lado2){
        JOptionPane.showMessageDialog(null,"O triângulo é isósceles:  " + lado1 + "  " + lado2 + "  " + lado3);
}
}

void calcularBase() {
    if (lado1 > lado2 && lado1 > lado3){
        this.base = lado1;
    } else if (lado2 > lado1 && lado2 > lado3){
        this.base = lado2;
    }
    else this.base = lado3;
}

void calcularArea(){
    this.area = (this.altura * this.base)/2;
}

void calcularPerimetro(){
    this.perimetro = (this.lado1 + this.lado2 + this.lado3);
}
}