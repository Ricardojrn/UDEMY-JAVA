package exemplo2;

import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        Empregado empregado = new Empregado();
        System.out.println("Entre com as informações do funcionário");
        System.out.print("Nome: ");
        empregado.nome = input.nextLine();
        System.out.print("Salario: ");
        empregado.salarioBruto = input.nextDouble();
        System.out.print("Taxa: ");
        empregado.taxa = input.nextDouble();

        System.out.println(empregado);

        System.out.println("Qual porcentagem deseja incrementar no salário? ");
        double porcentagem = input.nextDouble();;
        empregado.incrementaSalario(porcentagem);

        System.out.println("Empregado: "+empregado.nome+", $"+empregado.salarioLiquido());
    }
}
