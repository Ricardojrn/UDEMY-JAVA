package exemplo1;
/*Fazer um program para ler os valores da largura e altura de um retângulo.
* Em seguida, mostrar na tela o valor de sua area, perímetro e diagonal.*/

import java.util.Scanner;

public class exercicio {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("entre com as informações do retangulo");
        System.out.print("Largura: ");
        retangulo.largura = input.nextDouble();
        System.out.print("Altura: ");
        retangulo.altura = input.nextDouble();
        System.out.println(retangulo);
    }
}
