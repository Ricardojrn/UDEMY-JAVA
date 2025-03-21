package exemplo1;

public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return largura*altura;
    }
    public double perimetro(){
        return 2*(altura + largura);
    }
    public double diagona(){
        return Math.sqrt(largura * largura + altura * altura);
    }

    public String toString() {
        return "Área: "+area()+
                "\nperimetro: "+perimetro()+
                "\ndiagonal: "+diagona();
    }
}
