import javax.swing.*;

public class Main {
    public static void main (String[] args){
    Aluno aluno = new Aluno();

    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
    aluno.setNome(nome);

    Integer matricula = Integer.valueOf(JOptionPane.showInputDialog("Digite o número da matrícula do aluno: "));
    aluno.setMatricula(matricula);

    Float notaProva1 = Float.valueOf(JOptionPane.showInputDialog("Digite a nota da primeira prova (Valor 3.0) : "));
    aluno.setNotaProva1(notaProva1);

    Float notaProva2 = Float.valueOf(JOptionPane.showInputDialog("Digite a nota da segunda prova (Valor 3.0) : "));
    aluno.setNotaProva2(notaProva2);

    Float notaTrabalho = Float.valueOf(JOptionPane.showInputDialog("Digite a nota do trabalho (Valor 4.0) : "));
    aluno.setNotaTrabalho(notaTrabalho);

    JOptionPane.showMessageDialog(null,"Alunos com nota total inferior a 6 serão reprovados.");

    aluno.notaTotal();

    if (aluno.isAprovado()){
    JOptionPane.showMessageDialog(null,"Matricula N° " + aluno.getMatricula() + "\n\n" + "Aluno(a) " + aluno.getNome() + " teve nota total = " + aluno.notaTotal() + ", portanto foi aprovado.");
    }

    else if (!aluno.isAprovado()){
        JOptionPane.showMessageDialog(null,"Matricula N° " + aluno.getMatricula() + "\n\n" + "Aluno(a) " + aluno.getNome() + " teve nota total = " + aluno.notaTotal() + ", portanto foi reprovado.");
    }

    }
    }