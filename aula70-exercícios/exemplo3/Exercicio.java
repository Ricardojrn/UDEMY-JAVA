package exemplo3;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Qual o nome do aluno: ");
        aluno.nome = input.nextLine();
        System.out.print("entre com a nota 1: ");
        aluno.nota1 = input.nextDouble();
        System.out.print("entre com a nota 2: ");
        aluno.nota2 = input.nextDouble();
        System.out.print("entre com a nota 3: ");
        aluno.nota3 = input.nextDouble();

        System.out.println("Aluno: "+aluno.nome+", nota final: "+aluno.notaFinal());
        if (aluno.notaFinal()<60.0){
            System.out.println("ALUNO REPROVADO!");
            System.out.println("Faltou "+aluno.faltandoNota()+" pontos");
        }else{
            System.out.println("ALUNO APROVADO!");
        }
    }
}
