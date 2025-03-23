package exemplo2;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }
    public void incrementaSalario(double porcentagem){
        salarioBruto += salarioBruto*porcentagem/100;
    }
    /*@Override
    public String toString() {
        return "Empregado: "+nome+", $"+salarioLiquido();
    }*/
}
